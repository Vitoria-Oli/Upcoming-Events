<script setup>
const props= defineProps({
  event:{
    type:Object,
  },
 });

</script>

<template>
    <v-card 
    class="mx-auto"
    max-width="400"
    id="Card"
  >
    <v-img
      class="align-end"
      height="200"
      cover
    >
    <img src="../assets/img/ConciertoBrillo.png" alt="Concierto" id="photo" class="CardSize">

      <v-card-subtitle id="date">{{ event.date }} - {{event.hour}}</v-card-subtitle>
    </v-img>

    <v-card-title class="pt-4" id="EventTitle">
      {{event.name}}
    </v-card-title>

    <v-card-text>
      <div class="EventDescription"><p>{{ event.description }}</p></div>

      <div class="VerMas"><a href="#">>>> ver más</a></div>

      <div class="Quotas"><p>Quedan <b>12</b> plazas de <b>{{event.capacity}}</b></p></div>
    </v-card-text>

    <v-card-actions>
      <v-btn  id="Apuntame">
        ¡Apúntame!
      </v-btn>

    </v-card-actions>
  </v-card>

</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

  #Card{
    font-family: Dosis;
    background-color: $Yellow;
    #photo{
        height: 200px;
        width: 400px;
    }
    #date{
      color: $Blue;
      font-weight: 800;
      opacity: 100;
    }
    #EventTitle{
      color: $Blue;
      padding-top: 0 !important;
    }
    .EventDescription{
      font-size: 1.1em;
    }
    .VerMas{
      display: flex;
      justify-content: flex-end;
    }
    .Quotas{
      display: flex;
      justify-content: center;
    }
    #Apuntame{
      margin: auto;
      color: $White;
      background-color: $Blue;
    }
    }
</style>