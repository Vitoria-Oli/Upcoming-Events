<script setup>
import Header from '../components/Header.vue';
</script>

<template>
    <Header></Header>
        <h2>Date de alta: <span>es necesario estar registrado para poder apuntarte a nuestros eventos.</span></h2>
  <form>
    <v-text-field
      v-model="state.name"
      :error-messages="v$.name.$errors.map(e => e.$message)"
      :counter="10"
      label="Nombre"
      required
      @input="v$.name.$touch"
      @blur="v$.name.$touch"
    ></v-text-field>

    <v-text-field
      v-model="state.email"
      :error-messages="v$.email.$errors.map(e => e.$message)"
      label="E-mail"
      required
      @input="v$.email.$touch"
      @blur="v$.email.$touch"
    ></v-text-field>

    <v-text-field
      v-model="state.password"
      :error-messages="v$.password.$errors.map(e => e.$message)"
      label="Contraseña"
      required
      @input="v$.password.$touch"
      @blur="v$.password.$touch"
    ></v-text-field>

    <v-text-field
      v-model="state.password"
      :error-messages="v$.password.$errors.map(e => e.$message)"
      label="Repite tu contraseña"
      required
      @input="v$.password.$touch"
      @blur="v$.password.$touch"
    ></v-text-field>

    <v-btn
      class="me-4"
      @click="v$.$validate"
    >
      submit
    </v-btn>
    <v-btn @click="clear">
      clear
    </v-btn>
  </form>
</template>

<style lang="scss" scoped>
    
</style>