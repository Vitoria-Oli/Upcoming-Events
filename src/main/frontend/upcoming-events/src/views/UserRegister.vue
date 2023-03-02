<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Header></Header>
  <h2>
    Date de alta:
    <span
      >es necesario estar registrado para poder apuntarte a nuestros
      eventos.</span
    >
  </h2>
  <form id="form">
    <div class="form-group">
      <input
      
        type="text"
        class="form-control"
        id="name"
        placeholder="Introduce tu nombre"
        required
      />
    </div>
    <div class="form-group">
      <input
       
        type="email"
        class="form-control form-control-lg"
        id="email"
        placeholder="Escribe un email"
        required
      />
    </div>
    <div class="form-group">
      <input
       
        type="password"
        class="form-control form-control-lg"
        id="password"
        placeholder="Introduce una contraseña"
        required
      />
    </div>

    <div class="form-group">
      <input
       
        type="password"
        class="form-control form-control-lg"
        id="ConfirmPassword"
        placeholder="Repite la contraseña"
        required
      />
    </div>
    <div id="buttons-box">
      <RouterLink to="/HomeView">
        <button type="button" class="btn btn-danger" id="cancel">Cancel</button>
      </RouterLink>
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

<style lang="scss" scoped></style>
