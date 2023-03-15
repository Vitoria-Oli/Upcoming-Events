<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Header></Header>
  <form id="form">
    <div class="form-group">
      <input
        type="date"
        class="form-control"
        id="date"
        placeholder="Introduce una fecha"
        required
      />
    </div>
    <div class="form-group">
      <input
        type="text"
        class="form-control form-control-lg"
        id="hora"
        placeholder="Añade la hora"
        required
      />
    </div>
    <div class="form-group">
      <input
        type="text"
        class="form-control form-control-lg"
        id="titulo"
        placeholder="Introduce un titulo"
        required
      />
    </div>

    <div class="form-group">
      <input
        type="text"
        class="form-control form-control-lg"
        id="description"
        placeholder="Añade una descripción"
        required
      />
    </div>

    <div class="form-group">
      <input
        type="number"
        class="form-control form-control-lg"
        id="plazas"
        placeholder="Determina el número de plazas"
        required
      />
    </div>

    <div class="form-group">
      <input
        type="file"
        class="form-control form-control-lg"
        id="file"
        placeholder="Añade una imagen"
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
@import "../assets/scss/Variables.scss";
</style>
