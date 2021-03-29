<template>
  <div id="register" class="text-center">
    <img id="registerLogo" src="@/assets/logos/logo_main.png" alt="Swipe Right For Bytes">
    <form class="form-register" @submit.prevent="register">
      <h1 id="createAccount" class="h3 mb-3 font-weight-normal">Create Account</h1>
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
      </div>
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
        pattern="^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$"
      />
      <label for="confirmPassword" class="sr-only">Confirm Password</label>
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        v-model="user.confirmPassword"
        required
      />
      <p class="attention">Password must have 
        at least 8 characters,
        an uppercase letter, 
        a lowercase letter 
        and a number.</p>
        <section id="create">
    <button id="createButton"  class="btn" type="submit">
        Create
      </button>
      <p class="currentUser">
        Already have an account?   
      </p>
      <router-link style="text-decoration: none; color: red; font-size: 18px; font-family: Arial;" id="loginLink" :to="{ name: 'login' }"> LOG IN HERE</router-link>
      </section>
    </form>
  </div>
</template>

<script>

import authService from '../services/AuthService';

export default {
  components: {},
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'A user with that email already exist please sign into your account to continue';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
};
</script>

<style>
#loginLink{
  font-weight:800;
}

 .currentUser {
    font-family: sans-serif;
    font-size: 14px;
    color:black;
    grid-area: currentUser;
    
  }
#createButton{
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
label{
  padding: 2.5px;
}

#createAccount{
  font-family: sans-serif;
  color: #ed1c24;
  font-size: 25px;
  
}
/* #container {
  display: flex;
  box-sizing: border-box;
  font-size: 10px;
  font-family: sans-serif;
  --active-color: #ed1c24;
  background:url(../assets/Artboard_10.png);
} */

  .btn:hover{
    background-color:rgb(216, 106, 106)
  }  

  .attention {
    font-family: sans-serif;
    font-size: 11px;
    color:black;
    
  }
  #register {
    display: flex;
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
  .form-register {
    display: flex;
    flex-direction: column;
    flex-basis: 50%;
    align-items: left;
    
    
  }
  input {
    margin-bottom: 1em;
    border-radius: 3px;
    padding-top: 15px;
    padding-bottom: 10px;
    width: 60%;
    
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
