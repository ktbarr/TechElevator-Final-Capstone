<template>
  <div id="container" class="restaurantDetails">
      <h1 id="name">Restaurant Name</h1>
  </div>
</template>

<script>
export default {
  name: "restaurantDetails",
  
};
</script>

<style scoped>

#name{
  font-family: sans-serif;
  color: #ed1c24;
  font-size: 25px;
}

  #container {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  font-size: 10px;
  font-family: sans-serif;
  --active-color: #ed1c24;
  /* background:url('../assets/Artboard_9.png'); */
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
    
</style>>


