<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import PaginationEvents from "../components/PaginationEvents.vue";
import CardsEvents from "../components/CardsEvents.vue";
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";
import CloseSessionButton from "../components/CloseSessionButton.vue";
import DeleteAllButton from "../components/DeleteAllButton.vue";


const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});
</script>

<template>
  <Header></Header>


  <div id="EventsContainer">
    <h2>Todo lo que puedes ver y hacer:</h2>
    <div class="eventos">
      <CardsEvents v-for="event in store.Events" :event="event"></CardsEvents>
    </div>
  </div>
  <PaginationEvents></PaginationEvents>
  <Footer></Footer>
</template>

<style lang="scss">
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;
  #TitleAndButton{
    display: flex;
    justify-content: space-between;
    margin-top: 2vw;
  #ContainerButton{
    display: flex;
    justify-content: flex-end;
    margin-right: 24vh;
    margin-bottom: 3vh
  }}

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