<script setup>

</script>

<template>

<v-card id="Card">
  <v-img
      > <img src="../assets/img/Violinista.png" alt=""></v-img>
  <v-card-actions>
  <div id="Info">
    <p id="Date">2032/03/2023 - 21:30</p>
    <h3>Nuestros recomendados</h3>
    <p id="Text">In commodo lectus non mi dignissim, sed mollis risus sodales. In accumsan turpis quis nulla sollicitudin lacinia...</p>
      <v-btn>>>>Ver más</v-btn>
  </div>
  
  </v-card-actions>
</v-card>

</template>

<style lang="scss" scoped>
@import '../assets/scss/Variable.scss';


#Card{
    background-color: $Yellow;
    height: 40vh;
    width: 40vw;

 img{
 height: 25vh;
 width: 15vw;
 }
#Info{


  #Date{
    font-family: Dosis;
    font-weight: 800;
    color: $Blue;
  }
  h3{
    font-family: Dosis;
    font-weight: 500;
    color: $Blue;
  }
  #Text{
    font-family: Dosis;
  }
  v-btn{
    color: $Blue;
  }
}
}

</style>