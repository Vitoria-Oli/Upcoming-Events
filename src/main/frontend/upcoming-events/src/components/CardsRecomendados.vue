<script setup>
</script>

<template>
    <v-card
    class="mx-auto"
    max-width="400"
  >
    <v-img
      class="align-end text-white"
      height="200"
      cover
    >
    <img src="../assets/img/ConciertoBrillo.png" alt="Concierto" id="concierto">

      <v-card-title>Nuestros recomendados</v-card-title>
    </v-img>

    <v-card-subtitle class="pt-4">
      Number 10
    </v-card-subtitle>

    <v-card-text>
      <div>Whitehaven Beach</div>

      <div>Whitsunday Island, Whitsunday Islands</div>
    </v-card-text>

    <v-card-actions>
      <v-btn color="orange">
        Share
      </v-btn>

      <v-btn color="orange">
        Explore
      </v-btn>
    </v-card-actions>
  </v-card>

</template>

<style lang="scss" scoped>
    #concierto{
        height: 200px;
        width: 400px;
    }
</style>