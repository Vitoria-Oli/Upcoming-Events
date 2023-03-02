<script setup>
import { onBeforeMount } from "vue";
import { useUsersStore } from "../stores/Users";

const store = useUsersStore();
onBeforeMount(async () => {
  await store.fetchUsers("3");
});

const props = defineProps({
  event: {
    type: Object,
  },
});

</script>

<template>
  <v-card class="card">
    <div class="superior">
      <v-img class="img">
        <img src="../assets/img/Violinista.png" alt="" />
      </v-img>
      <div class="info">
        <p class="date">{{ event.date }} - {{ event.hour }}</p>
        <h3>{{ event.name }}</h3>
        <p class="text">
          {{ event.description }}
        </p>
        <p class="btn">>>> Ver más</p>
      </div>
    </div>

    <div class="infoPlaces">
      <p class="places">Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b></p>
      <v-btn class="button">¡Apúntame!</v-btn>
    </div>
  </v-card>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";


  
.card:hover {
  box-shadow: 8px 8px 8px rgba(128, 128, 128, 0.5);
}
.card {
    background-color: $Yellow;
    display: flex;
    flex-direction: column;
    justify-content: center;
  

    .superior {
      display: flex;
      flex-direction: row;
    }

    .img {
      height: 25vh;
      width: 14vw;
      justify-content: flex-start;
      justify-content: start;
      object-fit: cover;
      img {
        width: 100%;
        transition: all 0.4s;
      }
      img:hover {
        transform: scale(1.1);
      }
    }

    .info {
      margin: 2%;

      .date {
        font-family: Dosis;
        font-weight: 800;
        color: $Blue;
      }

      h3 {
        font-family: Dosis;
        font-weight: 500;
        color: $Blue;
      }

      .text {
        font-family: Dosis;
      }

      .btn {
        color: $Blue;
        border: none;
        display: flex;
        justify-content: flex-end;
      }
    }

    .infoPlaces {
      display: flex;
      justify-content: center;

      .places {
        font-family: Dosis;
        margin-right: 2%;
      }

      .button {
        color: $White;
        background-color: $Blue;
        font-family: Dosis;
        font-weight: 800;
      }
    }
  }

</style>
