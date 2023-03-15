import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import { useAuthStore } from "../stores/auth-storage";

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
      path: "/Welcome",
      name: "Welcome",
      component: () => import("../views/Welcome.vue"),
    },
    {
      path: "/AddEvents",
      name: "AddEvents",
      component: () => import("../views/AddEvents.vue"),
      // meta: { requiresAuth: true },
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
      meta: { requiresAuth: true },
    },
    {
      path: "/AdminEvents",
      name: "AdminEvents",
      component: () => import("../views/AdminEvents.vue"),
      // meta: { requiresAuth: true },
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
    },
    {
      path: "/SelectedEvents",
      name: "SelectedEvents",
      component: () => import("../views/SelectedEvents.vue"),
    }
  ],
});

router.beforeEach( async (to, from) => {
	const auth = useAuthStore();
	if(to.meta.requiresAuth && !auth.isAuthenticate) {
		return { name: 'Welcome' }
	}
})


export default router;
