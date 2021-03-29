<template>
  <div id="login" class="text-center">
  <img src="@/assets/logos/logo_main.png" 
    alt="Swipe Right For Bytes Main logo" a href="/">

    <form class="form-signin" @submit.prevent="login">
      <h2 class="h3 mb-3 font-weight-normal">Welcome! Please Login</h2>
    
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid email and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="email" class="sr-only">Email</label>
      <input
        type="email"
        id="email"
        class="form-control"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        v-model="user.password"
        required
      />
      <br>
      <br>
      <button class="btn" type="submit">Login</button>
      <p>Don't have an account?</p>
      <router-link style="text-decoration: none; color: red; font-size: 18px; font-family: Arial;" id="registerLink" :to="{ name: 'register' }">REGISTER HERE!</router-link>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/restaurants");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>
<style scoped>

#container {
  display: flex;
  box-sizing: border-box;
  font-size: 10px;
  font-family: sans-serif;
  --active-color: #ed1c24;
  background:
     url(../assets/Artboard_10.png)
     center / 100vw 
     no-repeat                
     fixed;
}

#registerLink
{
  font-weight: 800;
}

.btn{
  
  justify-content: left;
  padding: 0;
  margin: 0;
  background-color: #ed1c24;
  border-radius: 3px;
  border: 2px solid black;
  height: 50px;
  width: 150px;
  color: white;
  font-size: 20px;
  font-weight: bold;


  }
#login{
  display:flex;
  width: 100%;
  align-items: center;
  font-family: sans-serif;
  background:
     url(../assets/Artboard_10.png)
     center / 100vw 
     no-repeat                
     fixed;
  box-sizing: border-box;
  
  
}
form{
  display:flex;
  flex-direction: column;
  flex-basis: 50%;
  align-items: left;
}

p{
  font-size: 14px;
}
h2{
  color: #ed1c24
}
input{
  margin-bottom: 1em;
  padding-top: 15px;
  padding-bottom: 10px;
  border-radius: 3px;
  width: 60%;


}
label{
  padding-bottom: 15px;
  padding-top: 5px;
}


.flex-container {
  display: flex;
  flex-direction: row;
}

@media (max-width: 800px) {
  .flex-container {
    flex-direction: column;
  }
}
    

</style>
