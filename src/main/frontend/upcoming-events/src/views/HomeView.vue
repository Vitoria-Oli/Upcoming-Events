<script setup>
import Header from "../components/Header.vue";
import CardsRecomendados from "../components/CardsRecomendados.vue";
import CardsEvents from "../components/CardsEvents.vue";
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>

<template>
  <Header></Header>
  <div id="RecomendadosContainer">
    <h2>Nuestros recomendados</h2>

    <CardsRecomendados v-for="event in store.EventsRecommended" :event="event"></CardsRecomendados>
  </div>

  <div id="EventsContainer">
    <h2>Todo lo que puedes ver y hacer:</h2>
    <CardsEvents v-for="event in store.Events" :event="event"></CardsEvents>
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
