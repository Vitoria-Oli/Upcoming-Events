<script setup>
import {RouterLink} from "vue-router" 

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

</script>

<template>
<header>
    <img src="../assets/img/Header.png" alt="">
    <label for="date" id="date"></label>
    <div id="Nav">
      <v-layout class="overflow-visible" style="height: 56px;">
        <v-bottom-navigation
          v-model="value"
          active
          color="primary">
          <router-link to="/"><v-btn>Inicio</v-btn></router-link>

          <router-link to="/UserRegister"><v-btn>Date de alta</v-btn></router-link>

          <v-btn>
            <span>Zona de usuario</span>
          </v-btn>
        </v-bottom-navigation>
      </v-layout>
    </div>
</header>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

header{
    background-color: $Blue;
    display: flex;
    justify-content: baseline;

    label{
        font-family: Dosis;
        font-weight: 800;
        color: $White;
        font-size: 4vw;
    }
    #Nav{
      color: $White;
      display: flex;
      justify-content: flex-end;
    }
}

</style>