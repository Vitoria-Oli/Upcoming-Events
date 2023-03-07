<script setup>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Header></Header>
  <h1>Modificar Evento</h1>
  
  
  <form id="form">
    
    <div class = "formtwo">

      <div class="dateFields">
        <label for="name"><span class="Asterisk">* </span>Introduce la fecha</label>
        <input
        type="date"
        class="form-control"
        id="date"
        />
      </div>
      <div class="dateFields">
        <label for="name"><span class="Asterisk">* </span>Añade la hora</label>
        <input
        type="text"
        class="form-control form-control-lg"
        id="hora"
        />
      </div>
      <div class="check">
        <input
        type="checkbox"
        />
        <label for="name"> Recomendado</label>
      </div>
    </div>
       
    
    <div class="form-group">
      <label for="name"><span class="Asterisk">* </span>Introduce un titulo</label>
      <input
        type="text"
        class="form-control form-control-lg"
        id="titulo"
        />
        
    </div>

    <div class="form-group">
      <label for="name"><span class="Asterisk">* </span>Añade una descripción</label>
      <input
        type="text"
        class="form-control form-control-lg"
        id="description"
        />
        
    </div>

    <div class="form-group">
      <label for="name"><span class="Asterisk">* </span>Determina el número de plazas</label>
      <input
        type="number"
        class="form-control form-control-lg"
        id="plazas"
      />
    </div>

    <div class="form-group">
      <label for="name"><span class="Asterisk">* </span>Añade una imagen</label>
      <input
         type="file"
        class="form-control form-control-lg"
        id="file"
      />
    </div>
    
    <div id="buttons-box">
      <button
        type="button"
        class="btn btn-warning"
        id="reset"
        @click="resetForm()"
      >
        Borrar
      </button>
      <button type="button" class="btn btn-success" id="send" @click="save()">
        Añadir
      </button>
    </div>
  </form>
  <Footer></Footer>
</template>

<style lang="scss" scoped>
@import "../assets/scss/Variables.scss";

style> 
  #form{
  width: 90%;
}
label{
        font-weight: bold;
        font-size: 1.4em;
        .Asterisk{
        color: $Red;
      }
      }

      h1{
  font-family: Dosis;
  color: $Blue;
  font-weight: bold;
  padding: 40px;

}
 .formtwo{
  display: flex;
  
  .dateFields{
    display: flex;
    // flex-direction: column;
    flex-wrap: wrap;
    margin-left:30px;
    
     
  }
  
  
}
#form{
  display:flex;
  flex-direction: column;
}
input{
  height: 50px;
  border: solid 2px $Blue;
}

#buttons-box{
  display: flex;
  align-self: end;
  margin-top: 20px;
  margin-right: 40px;
}

.check{
  display: flex;
  flex-direction: row;
  align-content: end;
  margin-left: 130px;
  margin-top: 50px;
}

</style>
