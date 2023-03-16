<script setup>
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";
import { computed } from "@vue/reactivity";
import { ref } from "vue";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import CardsRecomendados from "../components/CardsRecomendados.vue";
import CardsEvents from "../components/CardsEvents.vue";
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";
import { computed } from "@vue/reactivity";
import { ref } from "vue";
import { useAuthStore } from "../stores/auth-storage";
import CloseSessionButton from "../components/CloseSessionButton.vue";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});

let pageSize = 2;
let pageNo = ref(1);

const eventsPaginated = computed(() => {
  const startIndex = (pageNo.value - 1) * pageSize;
  const data = [...store.Events];
  return data.splice(startIndex, pageSize);
});

const numPages = computed(() => {
  return Math.ceil(store.Events.length / pageSize);
});
</script>

<template>
  <Header></Header>
  <div id="RecomendadosContainer">
    <div id="TitleAndButton">
      <h2>Nuestros recomendados:</h2>
      <div id="ContainerButton"><CloseSessionButton></CloseSessionButton></div>
    </div>
    <v-sheet class="mx-auto" max-width="100%">
      <v-slide-group
        class="pa-4 arrows"
        selected-class="bg-success"
        show-arrows
      >
        <v-slide-group-item>
          <CardsRecomendados
            v-for="event in store.EventsRecommended"
            :event="event"
          ></CardsRecomendados>
        </v-slide-group-item>
      </v-slide-group>
    </v-sheet>
  </div>

  <div id="EventsContainer">
    <h2 id="TitleCardsEvents">Todo lo que puedes ver y hacer:</h2>
    <div class="eventos">
      <CardsEvents
        v-for="event in eventsPaginated"
        :event="event"
      ></CardsEvents>
    </div>
  </div>
  <v-pagination v-model="pageNo" :length="numPages"></v-pagination>
  <Footer></Footer>
</template>

<style lang="scss">
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;
  #TitleAndButton {
    display: flex;
    justify-content: space-between;
    margin-top: 2vw;
    #ContainerButton {
      display: flex;
      justify-content: flex-end;
      margin-right: 24vh;
      margin-bottom: 3vh;
    }
  }

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

  .v-slide-group__content {
    justify-content: center;
  }

  .v-slide-group .v-slide-group__prev i,
  .v-slide-group .v-slide-group__next i {
    background: rgba(0, 155, 219, 0.5) !important;
    border-radius: 5px;
    width: 40px;
    height: 57px;
    font-size: 64px;
    color: $White;
    transition: all 0.4s;

    &:hover {
      color: $Black;
      background: rgba(0, 155, 219, 1) !important;
    }
  }

  #EventsContainer{
    
    .eventos {
    display: grid;
    justify-content: center;
    grid-template-columns: 1fr;
    margin: 0 1% 0 1%;
  }

  }

  @media (max-width: 1000px) {
    .eventos {
      grid-template-columns: 1fr;
    }
  }
  @media (max-width: 500px) {
    #TitleAndButton #ContainerButton {
      margin-right: 6vw;
      margin-top: 2vh;
    }
  }
}
</style>
