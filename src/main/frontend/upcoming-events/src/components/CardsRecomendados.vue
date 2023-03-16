<script setup>
import { computed } from '@vue/reactivity';

const props = defineProps({
  event: {
    type: Object,
  },
});

const randomImage = computed({
  get() {
    return "default-" + Math.floor(Math.random() * 6) + ".jpg";
  }
})

</script>

<template>
  <v-card class="mx-auto card" width="260px">
    <v-img
      class="align-end photo"
      height="164"
      :src="`http://localhost:8080/images/${event.image[0].name}`"
            cover
            v-if="event.image[0]"
    >
    </v-img>
    <v-img class="align-end photo" height="164" :src="`http://localhost:8080/images/${randomImage}`" cover
        v-else>
      </v-img>

    <v-card-subtitle class="date"
      >{{ event.date }} - {{ event.hour }}</v-card-subtitle
    >
    <v-card-title class="pt-4 eventTitle">
      {{ event.name }}
    </v-card-title>
    <v-card-text class="nomargin">
      <div class="eventDescription">
        <p>{{ event.description }}</p>
      </div>
    </v-card-text>
    <v-card-actions>
      <div class="quotas">
        <button
          type="button"
          class="btn BtnPopUp"
          data-bs-toggle="modal"
          :data-bs-target="`#recommended${event.id}`"
        >
          >>> ver más
        </button>
        <p class="nomargin">
          Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b>
        </p>
        <v-btn class="apuntame">¡Apúntame!</v-btn>
      </div>
    </v-card-actions>
  </v-card>

  <div
    class="modal fade popup"
    :id="`recommended${event.id}`"
    tabindex="-1"
    aria-labelledby="exampleModalLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-body">
          <v-img
            class="modal-img"
            :src="`http://localhost:8080/images/${event.image[0].name}`"
            cover
            v-if="event.image[0]"
          >
          </v-img>
          <v-img class="modal-img" :src="`http://localhost:8080/images/${randomImage}`" cover
        v-else>
          </v-img>

          <div class="modal-info">
            <button
              type="button"
              class="btn btn-secondary x-close"
              data-bs-dismiss="modal">
               X
            </button>
            <p class="date">{{ event.date }} - {{ event.hour }}</p>
            <h3 class="eventTitle">{{ event.name }}</h3>
            <p class="text">
              {{ event.description }}
            </p>
          
          <div class="infoPlaces">
            <p class="places">
              Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b>
            </p>
            <v-btn class="button">¡Apúntame!</v-btn>
           </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

.popup {
  width: 100%;
  height: 100%;
  z-index: 1000;
}

.card {
  font-family: Dosis;
  background-color: $Yellow;
  margin: 20px !important;
  position: relative;

  &:hover {
    box-shadow: 8px 8px 8px rgba(128, 128, 128, 0.5);
  }

  .nomargin {
    margin-bottom: 0;
    padding-bottom: 0;
  }

  .photo {
    transition: all 0.4s;

    &:hover {
      transform: scale(1.4);
    }
  }

  .date {
    color: $Blue;
    font-weight: bold;
    margin-top: 10px;
  }

  .eventTitle {
    color: $Blue;
    padding-top: 0 !important;
    font-size: 24px;
    margin-bottom: 0;
    padding-bottom: 0;
  }

  .eventDescription p {
    font-size: 16px;
    margin-bottom: 90px;
  }

  .quotas {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin-bottom: 0;
    font-size: 20px;
    font-variant: initial !important;
    margin: 10px auto;
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    text-align: center;

    .BtnPopUp {
    display: flex;
    justify-content: flex-end;
    text-align: right;
    margin-bottom: 10px;
    width: 100%;
    text-align: right;
    padding: 0 15px;
    color: $Blue;
    border: none;
    &:hover {
      text-decoration: underline;
    }
  }

    .apuntame {
      margin: 10px auto 0 auto;
      color: $White;
      background-color: $Blue;
      font-size: 16px;
      font-weight: bold;
      margin-bottom: 10px;

      &:hover {
        color: $Blue;
        background-color: $White;
      }
    }
  }
}

.modal-dialog{
  display: flex;
  justify-content: center;
  align-items: center;
.modal-content{
  width: 60vw;
  display: flex;
  justify-content: center;
  align-items: center;

  .modal-body{
    width: 60vw;
    display: flex;
    justify-content: space-between; 
    align-items: center;

    .modal-img{
      width: 20vw;
      height: 44vh;
      border-radius: 5%;
      margin-right: 2vw;
    }

    .modal-info{
      background-color: $Yellow;
      width: 100vw;
      border-radius: 3%;

      .x-close{
        background-color: $Blue;
        display: flex;
        margin-left: 85%;
        margin-top: 2%;
      }
      .date {
        color: $Blue;
        font-size: 1.4rem;
        margin-left: 2vw;
       }
      .eventTitle{
      color: $Blue;
      font-weight: bold;
      font-size: 2vw;
      margin-left: 2vw;
      }
      .text{
       font-size: 1.3rem;
       margin-bottom: 3px;
       margin-left: 2vw;
      }
      .infoPlaces{
       margin-top: 2vw;
       margin-right: 3rem;
       margin-left: 2vw;
       display: flex;
       justify-content: space-between;
       
      }
      .places{
      font-size: 1.4rem;
      margin-left: 2vw;
      }
      .button{
      color: $White;
      background-color: $Blue;
      font-size: 16px;
      font-weight: bold;
      font-variant: initial !important;
      margin-right: 7px;
      &:hover {
        color: $Blue;
        background-color: $White;
      }
      }
    }
  }
}
}


</style>
