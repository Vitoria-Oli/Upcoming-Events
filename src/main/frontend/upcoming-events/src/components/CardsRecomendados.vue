<script setup>
const props = defineProps({
  event: {
    type: Object,
  },
});

</script>

<template>
  <v-card class="mx-auto card" max-width="400">
    <v-img class="align-end" height="200" cover>
      <img src="../assets/img/ConciertoBrillo.png" alt="Concierto" class="cardSize photo">
      <v-card-subtitle class="date">{{ event.date }} - {{ event.hour }}</v-card-subtitle>
    </v-img>

    <v-card-title class="pt-4 eventTitle">
      {{ event.name }}
    </v-card-title>

    <v-card-text>
      <div class="eventDescription">
        <p>{{ event.description }}</p>
      </div>

      <div class="VerMas"><a href="#">&lt;>>> ver más</a></div>

      <div class="quotas">
        <p>Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b></p>
      </div>
    </v-card-text>

    <v-card-actions>
      <v-btn class="apuntame">
        ¡Apúntame!
      </v-btn>

    </v-card-actions>
  </v-card>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';


.card:hover {
  box-shadow: 8px 8px 8px rgba(128, 128, 128, 0.5);
}
.card {
  font-family: Dosis;
  background-color: $Yellow;

  .photo {
    width: 100%;
    transition: all 0.4s;
  }
  .photo:hover {
    transform: scale(1.1);
  }

  .date {
    color: $Blue;
    font-weight: 800;
    opacity: 100;
  }

  .eventTitle {
    color: $Blue;
    padding-top: 0 !important;
  }

  .eventDescription {
    font-size: 1.1em;
  }

  .verMas {
    display: flex;
    justify-content: flex-end;
  }

  .quotas {
    display: flex;
    justify-content: center;
  }

  .apuntame {
    margin: auto;
    color: $White;
    background-color: $Blue;
  }
  .apuntame:hover {
    margin: auto;
    color: $Blue;
    background-color: $White;
  }
}

</style>