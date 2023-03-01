<script setup>
import Header from "../components/Header.vue";
import CardsRecomendados from "../components/CardsRecomendados.vue";
import CardsEvents from "../components/CardsEvents.vue";
</script>

<template>
  <Header></Header>
  <div id="RecomendadosContainer">
    <h2>Nuestros recomendados</h2>

    <CardsRecomendados></CardsRecomendados>
  </div>

  <div id="EventsContainer">
    <h2>Todo lo que puedes ver y hacer:</h2>
    <CardsEvents></CardsEvents>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;
  h2 {
    color: $Blue;
    margin-top: 2%;
    margin-left: 8%;
    margin-bottom: 1%;
    font-weight: 700;
  }
}
</style>
