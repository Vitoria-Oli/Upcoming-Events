<script setup>
//Fecha

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

      <v-card-subtitle id="date">10/12/2023 - 21:30</v-card-subtitle>
    </v-img>

    <v-card-title class="pt-4" id="EventTitle">
      Nuestros recomendados
    </v-card-title>

    <v-card-text>
      <div class="EventDescription"><p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloribus impedit consequuntur nihil? Nihil, iste ad!</p></div>

      <div class="VerMas"><a href="#">>>> ver más</a></div>

      <div class="Quotas"><p>Quedan <b>12</b> plazas de <b>150</b></p></div>
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