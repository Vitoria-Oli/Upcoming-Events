<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Header></Header>
  <h1>
    Date de alta:
    <span
      id="Subtitle">es necesario estar registrado para poder apuntarte a nuestros
      eventos.</span
    >
  </h1>
  <form id="form">
    <div class="form-group">
      <label for="name"><span class="Asterisk">* </span>Nombre</label>
      <input
      
        type="text"
        class="form-control"
        id="name"
        placeholder="Introduce tu nombre"
        required
      />
    </div>
    <div class="form-group">
      <label for="email"><span class="Asterisk">* </span>E-mail</label>
      <input
       
        type="email"
        class="form-control form-control-lg"
        id="email"
        placeholder="Escribe un email"
        required
      />
    </div>
    <div class="form-group">
      <label for="password"><span class="Asterisk">* </span>Contraseña</label>
      <input
       
        type="password"
        class="form-control form-control-lg"
        id="password"
        placeholder="Introduce una contraseña"
        required
      />
    </div>

    <div class="form-group">
      <label for="password"><span class="Asterisk">* </span>Repite tu contraseña</label>
      <input
       
        type="password"
        class="form-control form-control-lg"
        id="ConfirmPassword"
        placeholder="Repite tu contraseña"
        required
      />
    </div>
    <div id="buttons-box">
  
      <button
        type="button"
        class="btn btn-warning"
        id="reset"
        @click="resetForm()"
      >
        Reset
      </button>
      <button type="button" class="btn btn-success" id="send" @click="save()">
        Send
      </button>
    </div>
  </form>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

*{
font-family: Dosis;

h1{
  color: $Blue;
  margin: 1% 0 2% 2%;
  #Subtitle{
    color: $Black;
    font-size: 0.6em;
  }
}
form{
  width: 90%;
  margin: auto;
  
  .form-group{
    margin: 1% 0 1% 0;
  }
}
}
</style>
