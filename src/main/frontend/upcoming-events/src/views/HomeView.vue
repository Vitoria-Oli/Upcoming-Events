<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import CardsRecomendados from "../components/CardsRecomendados.vue";
import CardsEvents from "../components/CardsEvents.vue";
import CloseSession from "../components/CloseSession.vue";
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
    <CloseSession></CloseSession>
    <div class="eventosRecomendados">
      <CardsRecomendados v-for="event in store.EventsRecommended" :event="event"></CardsRecomendados>
    </div>
  </div>

  <div id="EventsContainer">
    <h2>Todo lo que puedes ver y hacer:</h2>
    <div class="eventos">
      <CardsEvents v-for="event in store.Events" :event="event"></CardsEvents>
    </div>
  </div>
  <Footer></Footer>
</template>

<style lang="scss">
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

  // .eventosRecomendados {
  //   padding: 0 40px;
  //   display: grid;
  //   grid-template-columns: 1fr 1fr 1fr 1fr;
  //   gap: 20px;
  // }

  .v-slide-group__content {
  justify-content: center;
}
  .v-slide-group .v-slide-group__prev i,
  .v-slide-group .v-slide-group__next i {
    background: rgba(0, 155, 219, 0.5) !important;
    border-radius: 5px;
    width: 30px;
    height: 30px;
}
  .eventos {
    padding: 0 40px;
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 20px;
  }

  @media (max-width: 1000px) {
    .eventos {
      grid-template-columns: 1fr;
    }
  }
}
</style>
