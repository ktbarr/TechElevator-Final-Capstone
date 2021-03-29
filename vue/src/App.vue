<template>
  <div id="app">
    <div id="nav">
      <router-link style="text-decoration: none; color: red; font-size: 18px; font-family: Arial;" v-bind:to="{ name: 'restaurants' }" v-if="$store.state.token != ''">RESTAURANTS | </router-link>
      <router-link style="text-decoration: none; color: red; font-size: 18px; font-family: Arial;" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">LOGOUT</router-link>
    </div>
    <router-view />
  </div>
</template>

<script> 


export default {
  name: 'App',
  components: {
  
}
}
</script>

<style>
router-view {
  background:
     url(./assets/Artboard_10.png)
     center / 100vw 
     no-repeat                
     fixed;
}

</style>
