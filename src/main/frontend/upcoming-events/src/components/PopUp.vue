<script setup>

window.onload = function() {
  document.querySelector('.open-popup-btn').addEventListener('click', function() {
    document.querySelector('.popup').style.display = 'block';
  });

  document.querySelector('.close-popup-btn').addEventListener('click', function() {
    document.querySelector('.popup').style.display = 'none';
  });
}


</script>

<template>
    <v-row justify="center">
      <v-dialog
        v-model="dialog"
        width="800"
      >
        <template v-slot:activator="{ props }">
          <v-btn
            color="primary"
            v-bind="props"
          >
            Open Dialog
          </v-btn>
        </template>
        <v-card>
          <v-card-title>
            <span class="text-h5">Use Google's location service?</span>
          </v-card-title>
          <v-card-text>
        text
          </v-card-text>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
              color="green-darken-1"
              variant="text"
              @click="dialog = false"
            >
              Disagree
            </v-btn>
            <v-btn
              color="green-darken-1"
              variant="text"
              @click="dialog = false"
            >
              Agree
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
    </v-row>
  </template>
