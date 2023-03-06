<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";

function resetForm() {
  document.getElementById("email").value = "";
  document.getElementById("password").value = "";
  document.getElementById("ConfirmPassword").value = "";
  // incident.email = "";
  // incident.password = "";
  // incident.ConfirmPassword ="";
}
</script>

<template>
  <Header></Header>
  <h1>
    Date de alta:
    <span id="Subtitle"
      >es necesario estar registrado para poder apuntarte a nuestros
      eventos.</span
    >
  </h1>
  <form id="form">
    <div class="form-group">
      <label for="name" id="conditions"><span class="Asterisk">* </span>Todos los campos son obligatorios</label>
      
    </div>
    <div class="form-group">
      <label for="email"><span class="Asterisk">* </span>E-mail</label>
      <input
        v-model="inputResetEmail"
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
        v-model="inputResetPassword"
        type="password"
        class="form-control form-control-lg"
        id="password"
        placeholder="Introduce una contraseña"
        required
      />
    </div>

    <div class="form-group">
      <label for="password"
        ><span class="Asterisk">* </span>Repite tu contraseña</label
      >
      <input
        v-model="inputResetConfirmPassword"
        type="password"
        class="form-control form-control-lg"
        id="ConfirmPassword"
        placeholder="Repite tu contraseña"
        required
      />
    </div>
    <div id="buttons-box">
      
      <button type="button" class="btn btn-success" id="send" @click="save()">
        Suscribirse
      </button>

      <button
        type="button"
        class="btn btn-success"
        id="reset"
        @click="resetForm()"
      >
        Borrar
      </button>
    </div>
  </form>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;

  h1 {
    color: $Blue;
    margin: 1% 0 2% 2%;
    #Subtitle {
      color: $Black;
      font-size: 0.6em;
    }
  }
  form {
    width: 90%;
    margin: auto;

    .form-group {
      margin: 1% 0 1% 0;
      #conditions{
        font-weight: normal;
        display: flex;
        justify-content: flex-end;
        margin-right: 4%;
        margin-bottom: -6vh;
      }
      label{
        font-weight: bold;
        font-size: 1.4em;
        .Asterisk{
        color: $Red;
      }
      }
      
      input {
        border: solid 2px $Blue;
      }
    }
    #buttons-box {
      display: flex;
      flex-direction: row-reverse;
      justify-content: flex-start;
      align-items: center;
      gap: 20px;
      #send{
        background-color: $GreenButton;
        border: solid 3px $GreenButton;
        
      }

      #reset{
        background-color: $YellowButton;
        border: solid 3px $YellowButton;
      }
    }
  }
}
</style>
