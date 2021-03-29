<template>
  <h1>Logout</h1>
</template>

<script>
export default {
  created() {
    this.$store.commit("LOGOUT");
    this.$router.push("/login");
  }
};
</script>


<style>
#container {
  display: flex;
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
    


</style>
