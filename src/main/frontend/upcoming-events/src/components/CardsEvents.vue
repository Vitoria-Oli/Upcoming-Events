<script setup>

</script>

<template>

<v-card id="Card">

  <v-img  id="img"
      > <img src="../assets/img/Violinista.png" alt="">
  </v-img>
    <div id="Info">
      <p id="Date">2032/03/2023 - 21:30</p>
      <h3>Nuestros recomendados</h3>
      <p id="Text">In commodo lectus non mi dignissim, sed mollis risus sodales. In accumsan turpis quis nulla sollicitudin lacinia...</p>
      <p id="Btn">>>> Ver más</p>

    </div>

  <div id="InfoPlaces">
  <p id="Places">Quedan <b>12</b> plazas de <b>150</b></p>
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
@import '../assets/scss/Variables.scss';

#app{
  display: flex;
  flex-direction: column;
  
  #Card{
    background-color: $Yellow;
    height: 40vh;
    width: 35vw;
    display: flex;
    justify-content: baseline;

    #img{
    height: 25vh;
    width: 14vw;
    }
    #Info{
    margin: 2%;

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
      #Btn{
        color: $Blue;
        border: none;
        display: flex;
        justify-content: flex-end;
      }
    }
    #InfoPlaces{
      display: flex;
      

      #Places{
        font-family: Dosis;
        margin-right: 2%;
      }

      #Button{
        color: $White;
        background-color: $Blue;
        font-family: Dosis;
        font-weight: 800;
      }
    }
  }
}

#Pagination{
  color: $Blue;
}

</style>