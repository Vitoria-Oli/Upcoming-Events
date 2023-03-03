import { defineStore } from "pinia";

export const useUsersStore = defineStore({
  id: "Users", 
  state: () => ({
    Users: [],
  }),
  actions: {
    async fetchUsers(id) {
      const url = "http://localhost:8080/api/users/" + id;
      const response = await fetch(url);
      const responseJson = await response.json();
      this.Users = responseJson;
    },
  },
});