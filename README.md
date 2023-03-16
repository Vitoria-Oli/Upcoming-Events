## Tabla de Contenido
1. [Información General](#Info-General)
2. [Tecnologías](#Tecnologías)
3. [Herramientas](#Herramientas)
4. [Vistas](#Vistas)
5. [Autoras/es](#Autoras/es)


### Información General
Un colectivo de desarrollo de software quiere crear una aplicación web para gestionar sus eventos on-line como talleres, masterclass o webinars. Los usuarios podrán ver la descripción de un evento, apuntarse y desapuntarse. También podrán ver la lista de los eventos a los que se han apuntado. El administrador debe tener las herramientas para la gestión (CRUD) de los eventos.

## Requisitos Funcionales:

En portada la aplicación tendrá un slider con las masterclasses destacadas. Estas serán seleccionables por el administrador.
En portada habrá una lista paginada con todos los eventos ordenados del más cercano al más lejano en el tiempo.
Los eventos incluirán como mínimo: título, fecha/hora, número máximo de participantes, descripción y una imagen.
Los eventos pasados se deben mantener en la lista pero identificables como no disponibles.
Los usuarios deberán registrarse para apuntarse a un evento. Una vez apuntados no podran volver a hacerlo.
Los usuarios podrán ver en una página la lista de los eventos a los que están registrados.
El administrador podrá hacer un CRUD de los eventos.
Cuando un evento esté lleno (máximo número de participantes) nadie podrá registrarse.

## Extra:

Al apuntarse a un evento recibirán un email (empresarial - html ) con el link (zoom, meets, etc..) en donde se va a realizar, así como recordando el título del evento, la hora y el día.
Para que aplicaciones webs de terceros usen nuestros datos, abriremos una API con un endpoint (ruta o url en la api, ejm: /movies, /api/events) donde enviaremos una lista paginada de todos los eventos.


## Requisitos no funcionales:

Todos los requisitos y casos de usuario deberán estar testeados (tests de aceptación)
El envío de el email se deberá hacer usando un sistema de colas.
Releerte
Releerte es un MarketPlace enfocado a la venta de libros de segunda mano. El dinero recaudado a través de estas ventas va destinado a donaciones para Ongs relacionadas con la educación de los niños más desfavorecidos o sin recursos. También colaboramos en el equipamiento de bibliotecas en escuelas y centros de menores, para el enriquecimiento de la educación de los mismos.

### Tecnologías 

- HTML
- SCSS
- Java 
- Javascript
- SASS
- VUE
- SPRING BOOT
- Vuetify
- Pinnia
- Bootstrap



### Herramientas
- Diagramas.net
- Jira
- MySQL Server
- Git - GitHub
- Slack
- Visual Studio Code
- Figma


### Vistas


<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222680658-5dea4333-be5a-470a-af8a-d5f9337cd006.png"></p>

<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222680851-3906c38a-5dbe-481e-9e91-b88b59910e83.png"></p>

<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222681355-d7a596f4-154a-41fd-b7a0-f0db55efcff9.png"></p>

<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222681568-701461bf-bedd-43c6-a63c-6bbf4f40458b.png"></p>

<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222681758-9bff223d-d5ca-457a-81ce-1e1958df95dd.png"></p>

 <p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222682024-e093ef73-f111-456b-98e4-49ab4a739db0.png"></p>
 
<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222682291-fab3ffce-4902-4bba-a6ef-fc0c491739ef.png"></p>


<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222682459-5e48723a-4635-4d34-906c-ca8ae6cee2c2.png"></p>


<p align="center"><img width="400" alt="nombre" src="https://user-images.githubusercontent.com/116894398/222682459-5e48723a-4635-4d34-906c-ca8ae6cee2c2.png"></p>


- [Figma]
https://www.figma.com/file/PJWYU3KWCZRRhICxbMbMPd/Upcoming-Events?node-id=0%3A1&t=DCnHLqMbeYi54lFS-0


### Diagrama Base de Datos

![Captura de pantalla (218)](https://user-images.githubusercontent.com/116894398/222684842-34de3d15-9669-4625-beaa-97af6bd5fee1.png)



### Diagrama de Flujo


![Captura de pantalla (217)](https://user-images.githubusercontent.com/116894398/222677807-560650bc-4d3c-43a4-a824-aac9208f264a.png)

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

```sh
npm install
```

### Compile and Hot-Reload for Development

```sh
npm run dev
```

### Run Unit Tests with [Vitest](https://vitest.dev/)

```sh
npm run test:unit
```
# backend

  ```sh
mvn clean package
```


### Autoras/es
- [Vitoria Oliveira] (https://github.com/Vitoria-Oli)
- [Andrés Pérez] (https://github.com/Andrespz07)
- [Johnny Ramírez] (https://github.com/JohnnyRamirezSancho)
- [Guillermo Trigueros] (https://github.com/Guillermo292)
- [Manu Estrada] (https://github.com/Manu-Estrada)
