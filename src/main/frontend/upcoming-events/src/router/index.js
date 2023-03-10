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
      path: "/UserRegister",
      name: "UserRegister",
      component: () => import("../views/UserRegister.vue"),
    },
    {
      path: "/AddEvents",
      name: "AddEvents",
      component: () => import("../views/AddEvents.vue"),
    },

    {
      path: "/Welcome",
      name: "Welcome",
      component: () => import("../views/Welcome.vue"),
    },
    {
      path: "/CloseSessionButton",
      name: "CloseSessionButton",
      component: () => import("../components/CloseSessionButton.vue"),
    },
    {
      path: "/ModifyEvents",
      name: "ModifyEvents",
      component: () => import("../views/ModifyEvents.vue"),
    },
    {
      path: "/AdminEvents",
      name: "AdminEvents",
      component: () => import("../views/AdminEvents.vue"),
    },
    {
      path: "/DeleteAllButton",
      name: "DeleteAllButton",
      component: () => import("../components/DeleteAllButton.vue"),
    },
    {
      path: "/AddEventButton",
      name: "AddEventButton",
      component: () => import("../components/AddEventButton.vue"),
    }
  ],
});

export default router;
