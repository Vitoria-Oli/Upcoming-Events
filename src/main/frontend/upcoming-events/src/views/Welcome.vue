<script setup>
import { RouterLink } from "vue-router";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Header></Header>
  <div id="info">
    <div class="welcome">
      <h2>¡Bienvenido!</h2>
      <p>
        Es necesario estar registrado para poder apuntarte a nuestros
        eventos.<br />
        Si aún no estás dado de alta,
        <router-link to="/UserRegister">puedes hacerlo aquí.</router-link>
      </p>
    </div>
    <div class="pack">
      <div class="tex">
        <h3><span>*</span>E-mail</h3>
        <p><span>*</span>Todos los campos son obligatorios</p>
      </div>
      <input
        v-model="inputResetName"
        type="text"
        class="form-control"
        id="name"
        required
      />
      <div class="contra">
        <h3><span>*</span>Contraseña</h3>
      </div>
      <input
        v-model="inputResetPassword"
        type="password"
        class="form-control form-control-lg"
        id="password"
        required
      />
      <div class="d-grid gap-2 d-md-flex justify-content-md-end">
        <button type="button" class="btn btn-warning">Borrar</button>
        <button type="button" class="green btn btn-success">¡Adentro!</button>
      </div>
      </div>
  </div>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";
.welcome {
  display: flex;
  h2 {
    color: $Blue;
    font-size: 48px;
    font-family: Dosis;
    margin-left: 40px;
    margin-top: 65px;
    font-weight: bold;
  }
  p {
    margin-top: 70px;
    margin-left: 10px;
    font-family: Dosis;
    
  }
}
.tex {
  display: flex;
  margin-top: 5%;

  h3 {
    font-size: 20px;
    margin-left: 5%;
    font-family: Dosis;
    font-weight: bold;
  }
  p {
    margin-left: 70%;
    font-family: Dosis;
    
  }
}

.contra {
  margin-top: 2%;

  h3 {
    font-size: 20px;
    margin-left: 5%;
    font-family: Dosis;
    font-weight: bold;

  }
}


.pack {
  width: 80%;
  margin: auto;
}

.d-grid {
  margin-top: 5%;
  
}
button {
  color: #333333;
}
span {
  color: red;
}
.green {
  background-color: #00c000;
}
</style>
