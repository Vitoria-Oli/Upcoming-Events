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
  <v-card class="mx-auto card">
    <div class="headerCard">
      <v-img class="align-end photo" width="164" height="164" src="src/assets/img/ConciertoBrillo.png" cover>
      </v-img>
      <div class="headerTextcard">
        <v-card-subtitle class="date">{{ event.date }} - {{ event.hour }}</v-card-subtitle>
        <v-card-title class="pt-4 eventTitle">
          {{ event.name }}
        </v-card-title>
        <v-card-text class="nomargin">
          <div class="eventDescription">
            <p>{{ event.description }}</p>
          </div>
        </v-card-text>
      </div>
    </div>
    <div class="verMas"><a href="#">&gt;&gt;&gt; ver más</a></div>
    <div class="footerCard">
      <v-card-text class="nomargin">
        <div class="quotas">
          <p class="nomargin">
            Quedan <b>12</b> plazas de <b>{{ event.capacity }}</b>
          </p>
        </div>
      </v-card-text>
      <v-card-actions>
        <v-btn class="apuntame">¡Apúntame!</v-btn>
      </v-card-actions>
    </div>
  </v-card>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

.card {
  font-family: Dosis;
  background-color: $Yellow;
  margin: 20px !important;
  min-width: 420px;

  &:hover {
    box-shadow: 8px 8px 8px rgba(128, 128, 128, 0.5);
  }

  .nomargin {
    margin-bottom: 0;
    padding-bottom: 0;
  }


  .headerCard {
    display: flex;

    .photo {
      transition: all 0.4s;
      width: 164px;
      height: 164px;
      object-fit: cover;

      &:hover {
        transform: scale(1.1);
      }
    }

    .headerTextcard {
      width: calc(100% - 160px);

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
        margin-bottom: 3px;
      }

    }
  }

  .verMas {
      display: flex;
      justify-content: flex-end;
      text-align: right;
      margin-bottom: 10px;
      width: 100%;
      text-align: right;
      padding: 0 15px;;

      a {
        text-decoration: none;

        &:hover {
          text-decoration: underline;
        }
      }
    }
  .footerCard {
    display: flex;
    margin-bottom: 10px;

    .quotas {
      font-size: 20px;
      text-align: right;
    }
    
    .apuntame {
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
</style>