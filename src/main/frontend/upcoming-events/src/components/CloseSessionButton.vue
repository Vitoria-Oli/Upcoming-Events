<script setup>
import { useAuthStore } from '../stores/auth-storage';

const useAuthoritation = useAuthStore();
async function closeSession() {
    const url = "http://localhost:8080/api/logout";
    const r = fetch(url, {
        method: "GET",
    });
    const response = await r;
    if (response.status == 204) {
        useAuthoritation.isAuthenticate = false;
        useAuthoritation.username = "";
        useAuthoritation.roles = [];
    } else {
        alert("An error has occurred.\nPlease try again after a few minutes.");
    }
}

</script>

<template>
    <button type="button" class="btn btn-success" id="close" @click="closeSession">Cerrar<br>sesión</button>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

#close {
    font-family: Dosis;
    background-color: $PurpleButton;
    padding: 1vh 1.3vw;
}
</style>