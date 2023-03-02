<template>
    <div id="Pagination" class="text-center">
        <v-pagination v-model="page" :length="5" prev-icon="mdi-menu-left" next-icon="mdi-menu-right"></v-pagination>
    </div>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

#Pagination {
  color: $Blue;
}
</style>
