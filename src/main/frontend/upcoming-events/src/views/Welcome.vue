<script setup>
import { RouterLink } from "vue-router";
import { useAuthStore } from "../stores/auth-storage";
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import AuthService from "../assets/apis/authentication/authService";
import router from "../router";

let userName = "";
let password = "";
const store = useAuthStore();

const submitData = async () => {
  const authService = new AuthService();
  const response = await authService.login(userName, password);
  router.push("/");
};
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
    <v-form validate-on="submit" @submit.prevent="submitData">
      <div class="pack">
        <div class="tex">
          <h3><span>* </span>E-mail</h3>
          <p><span>* </span>Todos los campos son obligatorios</p>
        </div>
        <input
          v-model="userName"
          type="text"
          class="form-control"
          id="email"
          required
        />
        <div class="contra">
          <h3><span>* </span>Contraseña</h3>
        </div>
        <input
          v-model="password"
          type="password"
          class="form-control form-control"
          id="password"
          required
        />
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
          <button type="button" class="btn btn-warning">Borrar</button>
          <button
            type="submit"
            class="green btn btn-success"
            @click="submitData"
          >
            ¡Adentro!
          </button>
          <!-- <v-btn type="submit" block class="mt-2">Submit</v-btn> -->
        </div>
      </div>
    </v-form>
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
  input {
    border: 1px solid $Blue;
  }
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
