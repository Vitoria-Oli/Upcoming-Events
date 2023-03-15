<script setup>
import { RouterLink } from "vue-router";
import { computed } from "@vue/reactivity";
import { useAuthStore } from "../stores/auth-storage";

window.onload = function formDate() {
  let today = new Date();

  let day = today.getDate();
  let month = today.getMonth() + 1;
  let year = today.getFullYear();

  day = ('0' + day).slice(-2);
  month = ('0' + month).slice(-2);

  let printDate = `${day}/${month}/${year}`
  document.getElementById("date").innerHTML = printDate

};

    return `${day}/${month}/${year}`;
  },
});

const isAuthenticated = useAuthStore();

</script>

<template>
  <header>
    <figure>
      <img src="../assets/img/happiness-header.png" alt="Happiness & Co." />
    </figure>
    <div id="info">
      <p id="date">{{ date }}</p>
      <nav class="navbar navbar-expand-lg navbar-light bg-$Blue momarnopad">
        <div class="container-fluid momarnopad">
          <button
            id="toggler"
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon navbar-dark"></span>
          </button>
          <div
            class="collapse navbar-collapse momarnopad"
            id="navbarNavAltMarkup"
          >
            <div id="nav" class="navbar-nav momarnopad">
              <router-link to="/">Inicio</router-link>
              <router-link to="/UserRegister">Date de alta</router-link>
              <router-link to="/AddEvents" v-if="isAuthenticated.roles=='ROLE_ADMIN'">Zona de usuario</router-link>
              <router-link to="/Welcome" v-else>Login</router-link>
            </div>
          </div>
        </div>
      </div>
    </nav>
  </div>
</header>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

header{
    background-color: $Blue;
    display: flex;
    align-items: center;

    img{
      width: 40vw;
    }

  #Info{
    display: flex;
    display: block;
    justify-content: center;

    #date {
      font-family: Dosis;
      color: $White;
      font-size: 7.3vw;
      position: absolute;
      right: 2vw;
      top: 5.5vw;
    }

    nav {
      position: absolute;
      bottom: 0;
      right: 0;

    
    
    label{
      margin-left: 4vw;
        font-family: Dosis;
        font-weight: 800;
        color: $White;
        font-size: 4vw;
    }
    nav{
    padding: 0%;
    border-radius: 40%;
        a{        
          font-size: 2vw;
          font-family: Dosis; 
          font-weight: 700;
          color: $White;
          &:active{
            background-color: $White;
            color: $Blue;
          }
        }
    }
  }
}

</style>