<script setup>
import { RouterLink } from "vue-router";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import { useEventsStore } from "../stores/Events";
import { onBeforeMount } from "vue";
import AddEventButton from "../components/AddEventButton.vue"
import CloseSessionButton from "../components/CloseSessionButton.vue"
import CardsEventsAdmin from "../components/CardsEventsAdmin.vue";

const store = useEventsStore();
onBeforeMount(async () => {
  await store.fetchEvents();
});

</script>

<template>
<Header></Header>
     <div id="TitleAndButton">
      <h1>Bienvenido, Fulanito.<br>
        <h2><span>Listado de eventos:</span></h2>
      </h1>
    <div id="ContainerButton"> 
        <AddEventButton></AddEventButton>
        <CloseSessionButton></CloseSessionButton>
          </div>
     </div>

    
    <div id="EventsContainer">
        <div class="eventos">
          <CardsEventsAdmin v-for="event in store.Events" :event="event"></CardsEventsAdmin>
        </div> 
       </div> 


    
<Footer></Footer>

</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";
*{
    font-family: Dosis;
    #TitleAndButton{
        display: flex;
        justify-content: space-between;
        margin-top: 2vw;

        
      #ContainerButton{
        display: flex;
        gap: 8%;
        margin-top: 20px;
      }
    }
h1  {
    color: $Blue;
    margin-top: 40px;
    margin-left: 8%;
    margin-bottom: 20px;
    font-weight: 700;
  }
h2 {
    margin-top: 5px;
    
}
    
    
    font-weight: 700;
  } 
  .btn-add {
    margin-left: 1em;
  }

    



</style>