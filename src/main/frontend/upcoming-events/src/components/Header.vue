<script setup>
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
      <v-btn>Inicio</v-btn>

      <v-btn>Favorites</v-btn>

      <v-btn>
        <span>Nearby</span>
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

    label{
        font-family: Dosis;
        font-weight: 800;
        color: $White;
        font-size: 4vw;
    }
}

</style>