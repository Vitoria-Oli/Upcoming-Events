package com.events.upcoming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.upcoming.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}