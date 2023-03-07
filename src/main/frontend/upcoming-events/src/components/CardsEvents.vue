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
        <!-- Button trigger modal -->
<button id="BtnPopUp" type="button" class="btn" data-bs-toggle="modal" data-bs-target="#exampleModal">
  >>> ver más
</button>

<!-- Modal -->
<div class="modal fade " id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      <div class="modal-body">
          <v-img class="img">
          <img src="../assets/img/Violinista.png" alt="" />
        </v-img>
        <div class="info">
          <p class="date">{{ event.date }} - {{ event.hour }}</p>
          <h3>{{ event.name }}</h3>
          <p class="text">
            {{ event.description }}
          </p>
        </div>
        <div class="infoPlaces">
          <p class="places">Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b></p>
          <v-btn class="button">¡Apúntame!</v-btn>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
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
      width: 12vw;
      height: 12vw;
      justify-content: flex-start;
      justify-content: start;
      object-fit: cover;
      img {
        aspect-ratio: 1;
        width: 100%;
        transition: all 0.4s;
      }
      img:hover {
        transform: scale(1.2);
      }
    }

    .info {
      margin: 2%;
      width: 75%;

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
      .btn:hover {
        text-decoration: underline;
      }
      #BtnPopUp{
        background-color: none;
        color: $Blue;

      }
      .modal-content{
        background-color: $Yellow;
        
      }

    }


    .infoPlaces {
      display: flex;
      justify-content: center;
      align-items: baseline;
      margin-bottom: 20px;

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
      .button:hover {
        color: $Blue;
        background-color: $White;
        font-family: Dosis;
        font-weight: 800;
      }
    }
  }

</style>
