<script setup>
//Fecha

</script>

<template>
    <v-card 
    class="mx-auto"
    max-width="400"
    id="CardPrincipal"
  >
    <v-img
      class="align-end"
      height="200"
      cover
    >
    <img src="../assets/img/ConciertoBrillo.png" alt="Concierto" id="Concierto" class="CardSize">

      <v-card-subtitle id="date" class="text-subtitle-1">10/12/2023 - 21:30</v-card-subtitle>
    </v-img>

    <v-card-title class="pt-4" >
      Nuestros recomendados
    </v-card-title>

    <v-card-text>
      <div>Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloribus impedit consequuntur nihil? Nihil, iste ad!</div>

      <div class="VerMas"><a href="#">>>> ver más</a></div>
    </v-card-text>

    <v-card-actions>
      <v-btn color="orange">
        Share
      </v-btn>

    </v-card-actions>
  </v-card>

</template>

<style lang="scss" scoped>


  #CardPrincipal{
    font-family: Dosis;
    #concierto{
        height: 200px;
        width: 400px;
    }
    .VerMas{
      display: flex;
      justify-content: flex-end;
    }
    }
</style>