<script setup>
import { RouterLink } from "vue-router";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import CardsEvents from "../components/CardsEvents.vue";
</script>

<template>
<Header></Header>
    <div class="fulanito">
      <h2>Bienvenido, Fulanito.<br>
      <span>Listado de eventos:</span>
    </h2>
    </div>
    <div id="EventsContainer">
        <h2>Todo lo que puedes ver y hacer:</h2>
        <div class="eventos">
          <CardsEvents v-for="event in store.Events" :event="event"></CardsEvents>
        </div>
      </div>


    
<Footer></Footer>



    
    




</template>