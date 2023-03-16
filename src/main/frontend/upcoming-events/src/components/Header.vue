<script setup>
import { RouterLink } from "vue-router";
import { computed } from "@vue/reactivity";
const date = computed({
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
              <router-link to="/AddEvents">Zona de usuario</router-link>
            </div>
          </div>
        </div>
      </nav>
    </div>
  </header>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";
header {
  .momarnopad {
    margin: 0;
    padding: 0;
  }
  background-color: $Blue;
  display: flex;
  align-items: center;
  height: 20.5vw;
  position: relative;
  figure {
    margin: 0;
    width: 48vw;
    margin-left: 2vw;
    img {
      height: 27vw;
    }
  }
  button#toggler {
    box-shadow: none;
    border: 2px solid rgba(255, 255, 255, 0.8);
    color: $White;
  }
  #info {
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
      a {
        font-family: Dosis;
        font-size: 2vw;
        display: inline-block;
        padding: 1vw 2vw;
        border-radius: 5px 5px 0 0;
        color: $White;
        background-color: $Blue;
        transition: all 0.4s;
        text-decoration: none;
        font-weight: 700;
        &.router-link-exact-active,
        &:hover {
          background-color: $White;
          color: $Blue;
        }
      }
    }
  }
}
@media (max-width: 850px) {
  header {
    #info {
      nav {
        a {
          font-size: 16px;
        }
      }
    }
  }
}
</style>