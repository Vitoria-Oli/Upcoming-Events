package com.events.upcoming.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
// import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.events.upcoming.services.JpaUserDetailsService;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Autowired
        private MyBasicAuthenticationEntryPoint authenticationEntryPoint;

        private JpaUserDetailsService service;

        public SecurityConfig(JpaUserDetailsService service) {
                this.service = service;
        }

        @Bean
        SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http
                                .cors()
                                .and()
                                .headers(header -> header.frameOptions().sameOrigin())
                                .csrf(csrf -> csrf.disable())
                                .formLogin(form -> form.disable())
                                .logout(logout -> logout
                                                .logoutUrl("/api/logout")
                                                .deleteCookies("JSESSIONID"))
                                .authorizeRequests((auth) -> auth
                                                .antMatchers("/api/events", "/images/**").permitAll()
                                                .antMatchers("/api/users/**").permitAll()
                                                .antMatchers("/api/register/**").permitAll()
                                                .antMatchers("/api/login").hasAnyRole("ADMIN", "USER")
//                                                .antMatchers("/api").hasRole("ADMIN")
                                                .anyRequest()
                                                .authenticated())
                                .userDetailsService(service)
                                .sessionManagement(session -> session
                                                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS))
                                .httpBasic(basic -> basic
                                                 .authenticationEntryPoint(authenticationEntryPoint));
                                // .httpBasic(Customizer.withDefaults());
                                //http.addFilterAfter(new CustomFilter(), BasicAuthenticationFilter.class);
                return http.build();

        }

        @Bean
        PasswordEncoder passwordEncoder() {
                return new BCryptPasswordEncoder();
        }
}
