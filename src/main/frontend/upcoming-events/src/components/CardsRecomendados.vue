<script setup>
const props = defineProps({
  event: {
    type: Object,
  },
});
</script>

<template>
  <v-card class="mx-auto card" width="260px">
    <v-img
      class="align-end photo"
      height="164"
      :src="`http://localhost:8080/images/${event.image[0].name}`"
      cover
    >
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
            class="align-end photo"
            :src="`http://localhost:8080/images/${event.image[0].name}`"
            cover
          >
          </v-img>
          <div class="info">
            <p class="date">{{ event.date }} - {{ event.hour }}</p>
            <h3>{{ event.name }}</h3>
            <p class="text">
              {{ event.description }}
            </p>
          </div>
          <div class="infoPlaces">
            <p class="places">
              Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b>
            </p>
            <v-btn class="button">¡Apúntame!</v-btn>
          </div>
        </div>
        <div class="modal-footer">
          <button
            type="button"
            class="btn btn-secondary"
            data-bs-dismiss="modal"
          >
            Close
          </button>
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

    .verMas {
      text-align: left;
      font-size: 16px;
      margin-bottom: 15px;
      width: 100%;
      padding: 0 15px;

      a {
        text-decoration: none;

        &:hover {
          text-decoration: underline;
        }
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

.modal-backdrop{
  width: none;
  height: none;
  position: relative;

}
.fade{
  transition: none;
}
</style>
