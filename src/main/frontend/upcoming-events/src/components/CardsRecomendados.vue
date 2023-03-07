<script setup>
const props = defineProps({
  event: {
    type: Object,
  },
});
</script>

<template>
  <v-card class="mx-auto card" width="260px">
    <v-img class="align-end" height="200" cover>
      <img
        src="../assets/img/ConciertoBrillo.png"
        alt="Concierto"
        class="cardSize photo"
      />
      <v-card-subtitle class="date"
        >{{ event.date }} - {{ event.hour }}</v-card-subtitle
      >
    </v-img>

    <v-card-title class="pt-4 eventTitle">
      {{ event.name }}
    </v-card-title>

    <v-card-text class="nomargin">
      <div class="eventDescription">
        <p>{{ event.description }}</p>
      </div>

      <div class="verMas"><a href="#">&gt;&gt;&gt; ver más</a></div>

      <div class="quotas">
        <p class="nomargin">
          Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b>
        </p>
      </div>
    </v-card-text>

    <v-card-actions>
      <v-btn class="apuntame"> ¡Apúntame! </v-btn>
    </v-card-actions>
  </v-card>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

.card {
  font-family: Dosis;
  background-color: $Yellow;
  margin: 20px !important;
  &:hover {
  box-shadow: 8px 8px 8px rgba(128, 128, 128, 0.5);
}

  .photo {
    width: 100%;
    transition: all 0.4s;
  }
  .photo:hover {
    transform: scale(1.2);
  }

  .date {
    color: $Blue;
    font-weight: 800;
    opacity: 100;
  }

  .nomargin {
    margin-bottom: 0;
    padding-bottom: 0;
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
    text-align: right;

    a {
      text-decoration: none;
    }
    a:hover {
      text-decoration: underline;
    }
  }

  .quotas {
    display: flex;
    justify-content: center;
    margin-bottom: 0;
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
