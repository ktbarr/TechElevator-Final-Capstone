<template>

  <div id="container">
  <div id="navBar">
    <router-link to="/restaurants" id="restaurants">
      <h1>Swipe Right For Bytes</h1>
    </router-link>
    <router-link to="/restaurant-choices" id="Restaurant Choices">
      <button>My Choices </button>
    </router-link>
  </div>
  </div>
</template>

<script>


export default {
    name: 'navBar',
  
    }

</script>

<style scoped>
  #navbar {
    border-bottom: 1px solid #ddd;
    height: 75px;
    width: 100%;
  }

  #restaurant-link {
    text-align: center;
    display: block;
    color: black;
    font-size: 22px;
    left: 32px;
    position: absolute;
    top: 16px;
    text-decoration: none;
  }

  #products-link h1 {
      margin: 0;
  }

  #favorites-link {
    position: absolute;
    right: 16px;
    top: 16px;
  }
</style>
