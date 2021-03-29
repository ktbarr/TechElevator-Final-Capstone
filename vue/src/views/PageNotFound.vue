<template>
  <div id="container">
  <h1>404: Page Not Found</h1>
</template>

<script>
export default {
    name: 'PageNotFound',
};
</script>

<style scoped>
h1 {
    text-align: center;
}

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