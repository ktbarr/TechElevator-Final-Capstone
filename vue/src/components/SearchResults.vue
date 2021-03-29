<template>
  <div class='results-container'>
    <h1 v-if="$store.state.searchResults.length !== 0" class="centerHeader">Anything look appetizing?</h1>
    <div v-for="restaurant in $store.state.searchResults" v-bind:key="restaurant.id">
      
      <restaurant-card :restaurant="restaurant" />
    </div>
  </div>
</template>

<script>
import RestaurantCard from './RestaurantCard.vue'
export default {
  components: { RestaurantCard },
  name: "SearchResults"
}
</script>

<style scoped>
  .results-container{
    position: absolute;
    margin-top: 100px;
    width: 80%;
    right: 0px;
  }

  .centerHeader {
    display: flex;
    color: #ed1c24;
    flex-direction: column;
    align-items: center;
    margin-left: 70px;
    font-size: xx-large;
    margin-bottom: 2em;
}

  /* css positions : absolute, fixed, relative and sticky, static */
  @media  only screen and (max-width: 1280px)  {
    .results-container{
      position: relative;
      width: 100%;
      /* right: 0px; */
    }
  }

</style>
