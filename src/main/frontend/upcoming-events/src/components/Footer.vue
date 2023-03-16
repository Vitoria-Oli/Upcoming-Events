<script setup>
import { RouterLink } from "vue-router";
import { computed } from "@vue/reactivity";
import { useAuthStore } from "../stores/auth-storage";const date = computed({
  get() {
    let today = new Date();
    let day = today.getDate();
    let month = today.getMonth() + 1;
    let year = today.getFullYear();
    day = ("0" + day).slice(-2);
    month = ("0" + month).slice(-2);
    return `${day}/${month}/${year}`;
  },
});

const isAuthenticated = useAuthStore();

</script>

<template>
  <footer>
    <figure>
      <img
        class="logoFooter"
        src="../assets/img/happiness-blanco-1.png"
        alt="Happiness & Co."
      />
    </figure>
    <div class="infoFooter">
      <img
        id="slogan"
        src="../assets/img/happiness-blanco-2.png"
        alt="Happiness & Co."
      />
      <p class="date">{{ date }}</p>
      <p>Contáctanos: <a href="#">somostu@happinessandco.com</a></p>
    </div>
    <div id="nav">
      <ul>
        <li><router-link to="/">Home</router-link></li>
        <li><router-link to="/UserRegister">Registrate</router-link></li>
        <li v-if="!isAuthenticated.isAuthenticate"><router-link to="/Welcome">Login</router-link></li>
        <li v-if="isAuthenticated.roles=='ROLE_USER'"><router-link to="/SelectedEvents">Zona de usuario</router-link></li>
        <li v-if="isAuthenticated.roles=='ROLE_ADMIN'"><router-link to="/AdminEvents">Zona de admninistrador</router-link></li>
        <li v-if="isAuthenticated.roles=='ROLE_ADMIN'"><router-link to="/AddEvents">Añadir eventos</router-link></li>
        <li v-if="isAuthenticated.roles=='ROLE_ADMIN'"><router-link to="/ModifyEvents">Modificar eventos</router-link></li>
      </ul>
    </div>
  </footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";
footer {
  background-color: $Blue;
  display: flex;
  flex-direction: row;
  justify-content: start;
  width: 100%;
  height: auto;
  margin-top: 50px;
  figure {
    margin: 0;
    margin-left: 3vw;
  }
  .infoFooter {
    display: flex;
    flex-direction: column;
    justify-content: center;
    margin-left: 7vw;
    img {
      width: 26vw;
    }
    label {
      font-family: Dosis;
      font-weight: 800;
      color: $White;
      font-size: 4vw;
    }
    p {
      font-family: Dosis;
      color: $White;
      font-weight: bold;
    }
    .date {
      font-size: 3.6vw;
      line-height: 3.5vw;
      font-weight: normal;
    }
    a {
      text-decoration: none;
      color: $White;
      &:hover {
        text-decoration: underline;
      }
    }
  }
  #nav {
    font-family: Dosis;
    font-weight: normal;
    color: $White;
    margin-left: 13.3vw;
    display: flex;
    flex-direction: column;
    justify-content: center;
    a {
      text-decoration: none;
      color: $White;
      &:hover {
        text-decoration: underline;
      }
    }
  }
}
  @media (max-width: 850px) {
    footer {
      display: none;
      //     flex-direction: column;
      //     justify-content: center;
      //     align-items: center;
      //     padding-top: 15px;
      //     figure {
      //         display: none;
      //     }
      //     .infoFooter {
      //       margin: 0;
      //       img {
      //         width: 50vw;
      //       }
      //       label {
      //         font-size: 8vw;
      //       }
      //       p {
      //         font-family: Dosis;
      //         color: $White;
      //         font-weight: bold;
      //         font-size: 2.7vw;
      //       }
      //       .date {
      //         font-size: 10vw;
      //         line-height: 10vw;
      //       }
      //       a {
      //         text-decoration: none;
      //         color: $White;
      //         &:hover {
      //           text-decoration: underline;
      //         }
      //       }
      //     }
      //     #nav {
      //       font-family: Dosis;
      //       font-weight: normal;
      //       color: $White;
      //       margin-left: 13.3vw;
      //     }
    }
  }
</style>