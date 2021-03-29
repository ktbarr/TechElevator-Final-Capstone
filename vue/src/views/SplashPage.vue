<template>
  <div id="container">
    <div id="logo">
      <img src="@/assets/logos/logo_main.png" 
      alt="Swipe Right For Bytes Main logo" a href="/">
    </div>

    <div id="main-content">
      <h1>Looking for a dining adventure?</h1>

      <h2>You shouldn't need 30 texts to pick somewhere to eat.</h2>

      <h2>With Three Easy Tasks To Nail Down Your Group's Dinner</h2>
      <h2>(or Brunch or Lunch) Plans</h2>

 
      <div id="feature-icons">
        <div class="features">
          <img src="@/assets/Like_W_copy.png" alt="">
        </div>

        <div class="features">
          <img src="@/assets/Share_W_copy.png" alt="">
        </div>

        <div class="features">
          <img src="@/assets/Votte_W_copy.png" alt="">
        </div>
</div>


      <nav>
       

        <ul>
          <li><button class="btn" v-on:click="register">Register</button></li>
          <li><button class="btn" v-on:click="login">Login</button></li>
        </ul>
      </nav>
    </div>

  </div>
  
</template>

<script>
export default {

    methods: {
        register() {
            this.$router.push("/register");
        },
        login() {
            this.$router.push("/login");
        }
    }
}      

</script>

<style>
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

#main-content {
  font-size: 16px;
  display: flex-container;
  flex-direction: flex;
  margin-top: 75px;
}

#feature-icons {
  display: flex;
  margin-right: 100px;
  margin-top: 35px;
}

#feature-list>ul {
  list-style: none;
}

.features {
    margin-right: 60px;
    display: flex-wrap;
  
}

ul>li {
    margin-right: 2em;
    margin-bottom: 1.5em;
}

nav {
  display: flex;
}

nav>ul {
    list-style: none;
    display: flex;
    margin-left: 100px;
    margin-top: 35px;
}

nav li {
  margin-right: 2em;

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

.btn:hover{
  background-color:rgb(216, 106, 106)
}

header {
  align-self: center;
}


.flex-container {
  display: flex;
  flex-direction: row;
}

@media (max-width: 800px) {
  #container {
  flex-direction: column;
  }
}
    


</style>
