<script setup>
const props= defineProps({
  event:{
    type:Object,
  },
 });
</script>

<template>
  <v-card id="Card">
    <div id="Superior">
      <v-img id="img">
        <img src="../assets/img/Violinista.png" alt="" />
      </v-img>
      <div id="Info">
        <p id="Date">{{ event.date }} - {{event.hour}}</p>
        <h3>{{event.name}}</h3>
        <p id="Text">
         {{ event.description }}
        </p>
        <p id="Btn">>>> Ver más</p>
      </div>
    </div>

    <div id="InfoPlaces">
      <p id="Places">Quedan <b>12</b> plazas de <b>{{event.capacity}}</b></p>
      <v-btn id="Button">¡Apúntame!</v-btn>
    </div>
  </v-card>

  <div id="Pagination" class="text-center">
    <v-pagination
      v-model="page"
      :length="5"
      prev-icon="mdi-menu-left"
      next-icon="mdi-menu-right"
    ></v-pagination>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

#app {
  display: flex;
  flex-direction: column;
  height: 40vh;
  width: 35vw;

  #Card {
    background-color: $Yellow;
    height: 40vh;
    width: 35vw;
    display: flex;
    flex-direction: column;
    justify-content: center;

    #Superior {
      display: flex;
      flex-direction: row;
    }

    #img {
      height: 25vh;
      width: 14vw;
      justify-content: flex-start;
      justify-content: start;
    }
    #Info {
      margin: 2%;

      #Date {
        font-family: Dosis;
        font-weight: 800;
        color: $Blue;
      }
      h3 {
        font-family: Dosis;
        font-weight: 500;
        color: $Blue;
      }
      #Text {
        font-family: Dosis;
      }
      #Btn {
        color: $Blue;
        border: none;
        display: flex;
        justify-content: flex-end;
      }
    }
    #InfoPlaces {
      display: flex;
      justify-content: center;

      #Places {
        font-family: Dosis;
        margin-right: 2%;
      }

      #Button {
        color: $White;
        background-color: $Blue;
        font-family: Dosis;
        font-weight: 800;
      }
    }
  }
}

#Pagination {
  color: $Blue;
}
</style>
