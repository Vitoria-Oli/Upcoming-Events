import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: '/UserRegister',
      name: 'UserRegister',
      component: () => import('../views/UserRegister.vue')
    },
    {
      path: '/AddEvents',
      name: 'AddEvents',
      component: () => import('../views/AddEvents.vue')
    },
    {
      path: '/Welcome',
      name: 'Welcome',
      component: () => import('../views/Welcome.vue')
    },

     {
      path: '/CloseSession',
      name: 'CloseSession',
      component: () => import ('../components/CloseSession.vue')
    }
  ],
});

export default router;
