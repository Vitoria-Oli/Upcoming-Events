<script setup>
import { RouterLink } from "vue-router"

import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
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
    <div class="eventosRecomendados">
      <CardsRecomendados v-for="event in store.EventsRecommended" :event="event"></CardsRecomendados>
    </div>
  </div>

  <div id="EventsContainer">
    <h2>Todo lo que puedes ver y hacer:</h2>
    <div class="eventos">
      <CardsEvents v-for=" event in store.Events" :event="event"></CardsEvents>
    </div>
  </div>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;

  h2 {
    color: $Blue;
    margin-top: 40px;
    margin-left: 8%;
    margin-bottom: 20px;
    font-weight: 700;
  }

  .eventosRecomendados {
    padding: 0 40px;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr 1fr;
    gap: 20px;
  }

  .eventos {
    padding: 0 40px;
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 20px;
  }

  @media (max-width:1200px) {
    .eventosRecomendados {
      grid-template-columns: 1fr 1fr 1fr;
    }
  }
  @media (max-width:1000px) {
    .eventosRecomendados {
      grid-template-columns: 1fr 1fr;
    }
    .eventos {
      grid-template-columns: 1fr;
    }
  }


  @media (max-width:700px) {
    .eventosRecomendados {
      grid-template-columns: 1fr;
    }
  }
}

</style>
