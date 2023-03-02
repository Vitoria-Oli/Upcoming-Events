<script setup>
window.onload = function formDate() {
  let today = new Date();

  let day = today.getDate();
  let month = today.getMonth() + 1;
  let year = today.getFullYear();

  day = ('0' + day).slice(-2);
  month = ('0' + month).slice(-2);

  let printDate = `${day}/${month}/${year}`
  document.getElementById("date").innerHTML = printDate

};

</script>

<template>
<header>
    <img src="../assets/img/Header.png" alt="">
    <div id="Info">
        <label for="date" id="date"></label >
          <nav class="navbar navbar-expand-lg navbar-light bg-$Blue">
      <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div id="Nav" class="navbar-nav">
            <a class="nav-link" aria-current="page" href="#">Inicio</a>
            <a class="nav-link" href="#">Date de alta</a>
            <a class="nav-link" href="#">Zona de usuario</a>
          </div>
        </div>
      </div>
    </nav>
    </div>
</header>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

header{
    background-color: $Blue;
    display: flex;
    align-items: center;

  #Info{
    display: flex;
    display: block;
    justify-content: center;

    
    label{
      margin-left: 4vw;
        font-family: Dosis;
        font-weight: 800;
        color: $White;
        font-size: 4vw;
    }
    nav{
    padding: 0%;
    border-radius: 40%;
        a{        
          font-size: 2vw;
          font-family: Dosis; 
          font-weight: 700;
          color: $White;
          &:active{
            background-color: $White;
            color: $Blue;
          }
        }
    }
  }
}

</style>