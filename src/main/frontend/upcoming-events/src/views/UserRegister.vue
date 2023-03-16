<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";


  function resetForm() {
  document.getElementById("userName").value = "";
  document.getElementById("password").value = "";
  document.getElementById("ConfirmPassword").value = ""
  incident.userName = "";
  incident.password = "";
}

let incident = {
  userName: "",
  password: ""
}
async function save() {
  if(incident.userName=="") {
    alert("email is needed");
    return;
  }
  if(incident.password=="") {
    alert("password is needed");
    return;
  }

  
  const payload = JSON.stringify(this.incident);
  console.log(payload)
  const url = "http://localhost:8080/api/register/add";
  const r = await fetch(url, {
    mode: "no-cors",
    method: "POST",
    body: payload,
    headers: {
      "Content-type": "application/json",
    }
  });
  const response = await r;
  console.log(response);
  if (response) {
    alert("Added " + incident.userName);
    resetForm();
  } else {
    alert("An error has occurred.\nPlease try again after a few minutes.");
  }
}



</script>

<template>
  <Header></Header>
  <h1>
    Date de alta:
    <span id="Subtitle"
      >es necesario estar registrado para poder apuntarte a nuestros
      eventos.</span
    >
  </h1>
  <form id="form">
    <div class="form-group">
      <label for="name" id="conditions"><span class="Asterisk">* </span>Todos los campos son obligatorios</label>
      
    </div>
    <div class="form-group">
      <label for="userName"><span class="Asterisk">* </span>E-mail</label>
      <input
        v-model="incident.userName"
        type="email"
        class="form-control form-control-lg"
        id="userName"
        placeholder="Escribe un email"
        required
      />
    </div>
    <div class="form-group">
      <label for="password"><span class="Asterisk">* </span>Contraseña</label>
      <input
        v-model="incident.password"
        type="password"
        class="form-control form-control-lg"
        id="password"
        placeholder="Introduce una contraseña"
        required
      />
    </div>

    <div class="form-group">
      <label for="password"
        ><span class="Asterisk">* </span>Repite tu contraseña</label
      >
      <input
        v-model="incident.ConfirmPassword"
        type="password"
        class="form-control form-control-lg"
        id="ConfirmPassword"
        placeholder="Repite tu contraseña"
        required
      />
    </div>
    <div id="buttons-box">
      
      <button type="button" class="btn btn-success" id="send" @click="save()">
        Suscribirse
      </button>

      <button
        type="button"
        class="btn btn-success"
        id="reset"
        @click="resetForm()">
        Borrar
      </button>
    </div>
  </form>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

* {
  font-family: Dosis;

  h1 {
    color: $Blue;
    margin: 1% 0 2% 2%;
    #Subtitle {
      color: $Black;
      font-size: 0.6em;
    }
  }
  form {
    width: 90%;
    margin: auto;

    .form-group {
      margin: 1% 0 1% 0;
      #conditions{
        font-weight: normal;
        display: flex;
        justify-content: flex-end;
        margin-right: 4%;
        margin-bottom: -6vh;
      }
      label{
        font-weight: bold;
        font-size: 1.4em;
        .Asterisk{
        color: $Red;
      }
      }
      
      input {
        border: solid 2px $Blue;
      }
    }
    #buttons-box {
      display: flex;
      flex-direction: row-reverse;
      justify-content: flex-start;
      align-items: center;
      gap: 20px;
      #send{
        background-color: $GreenButton;
        border: solid 3px $GreenButton;
        
      }

      #reset{
        background-color: $YellowButton;
        border: solid 3px $YellowButton;
      }
    }
  }
  @media (max-width: 500px){
    form .form-group label{
      font-size: 1.1em;
      
    }
    form .form-group #conditions{
        margin-bottom: -5vh;
      }
  }
  @media (max-width: 350px){
    form .form-group label{
      font-size: 1.0em;
      
    }
    form .form-group #conditions{
        margin-bottom: -4vh;
      }
  }
}
</style>
