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
<footer>
    <img id="Logo" src="../assets/img/happiness-blanco-1.png" alt="">
    <div id="Info">
        <img id="Slogan" src="../assets/img/happiness-blanco-2.png" alt="">
        <label for="date" id="date"></label >
        <p >Contáctanos: somostu@happinessandco.com</p>
    </div>
    <div id="Nav">
        <ol>
            <li>Home</li>
            <li>Registrate</li>
            <li>Zona de usuario</li>
            <router-link to="/AddEvents"><li>Zona de administración</li></router-link>
        </ol>
    </div>
</footer>
</template>

<style lang="scss" scoped>
@import '../assets/scss/Variables.scss';

footer{
background-color: $Blue;
display: flex;
flex-direction: row;
justify-content: space-around;
width: 100%;
margin-top: 50px;

 #Logo{
    display: flex;
    justify-content: start;
    margin-left: 0%;
 }

 #Info{
    display: flex;
    flex-direction: column;
    justify-content: center;
    margin-left: 5%;
    #Slogan{
        width: 20vw;
    }

    label{
        font-family: Dosis;
        font-weight: 800;
        color: $White;
        font-size: 4vw;
    }

    p{
        font-family: Dosis;
        font-weight: 800;
        color: $White;
    }
 }
}

 #Nav{
    font-family: Dosis;
    font-weight: 700;
    font-size: large;
    color: $White;
    display: flex;
    

 }

</style>