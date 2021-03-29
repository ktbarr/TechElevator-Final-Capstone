<template>
  <div id="page-wrap">
    <RestaurantGrid :restaurant=“restaurant" />
  </div>
</template>

<script>
import { restaurant } from '../    ';
import RestaurantGrid from '../components/RestaurantGrid.vue';

export default {
name: ‘RestaurantPage',
    components: {
      RestaurantGrid,
    },
    data() {
      return {
        products,
      };
    }
};
</script>
