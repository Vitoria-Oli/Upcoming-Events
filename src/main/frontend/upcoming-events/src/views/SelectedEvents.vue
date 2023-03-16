<script setup>
import { useAuthStore } from "../stores/auth-storage";
import { ref } from "vue";
import { computed } from "@vue/reactivity";
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import CardEventsSelected from "../components/CardEventsSelected.vue";
import CloseSessionButton from "../components/CloseSessionButton.vue";
import DeleteAllButton from "../components/DeleteAllButton.vue";


const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});

const isAuthenticated = useAuthStore();

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
      <h1>
        ¡Bienvenido, {{ isAuthenticated.username }}!<br />
        <span id="Subtitle">Estos son tus evento seleccionados:</span>
      </h1>
      <div id="ContainerButton">
        <DeleteAllButton></DeleteAllButton>
        <CloseSessionButton></CloseSessionButton>
      </div>
    </div>
    <div class="eventos">
      <CardEventsSelected
        v-for="event in eventsPaginated"
        :event="event"
      ></CardEventsSelected>
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
    margin-top: 2%;
    h1 {
      color: $Blue;
      margin: 1% 0 2% 5%;
      font-weight: 700;
      #Subtitle {
        color: $Blue;
        font-size: 0.6em;
      }
    }
    #ContainerButton {
      display: flex;
      gap: 7%;
      margin-right: 24vh;
      justify-content: center;
      align-items: center;
    }
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
