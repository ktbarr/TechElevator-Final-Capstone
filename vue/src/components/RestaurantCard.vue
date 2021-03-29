<template>

  <div id="container">
      <div id="main">
        
          <div class="restaurant-card">
          <div class="restaurant-img">
              <img class="restaurant-img" v-bind:src="restaurant.image_url" alt="">
          </div>
          <div class="restaurant-info">
              <div class="restaurant-address">
                  <h2>{{restaurant.name}}</h2>
                  <!-- <p>{{category}}</p> -->
                  <p>{{restaurant.location.address1}}</p>
                  <p>{{restaurant.location.city}}, {{restaurant.location.state}}, {{restaurant.location.zip_code}}</p>
              </div>
              <div class="restaurant-status">
                  <p>{{restaurant.is_closed? 'Closed':'Open Now'}}</p>
                  <p><a :href="restaurant.url" target="_blank">Visit Site</a></p>
                  <p>{{restaurant.display_phone}}</p>
              </div>
          </div>
      </div>
      </div>
    </div>
 
</template>

<script>
export default {
    name: 'restaurant-card',
    props: ['restaurant', ],
    computed: {
        category() {
            return this.$store.state.searchTerm;
        }
    }

}
</script>

<style scoped>
    #container {
        box-sizing: border-box;
    }
    #main {
        width: 100%;
        /* margin-left:auto; */
    }
    
    .restaurant-img {
        margin-right: 1.5em;
        width:125px;
    }

    .restaurant-card {
        display: flex;
        border: 3px solid #ed1c24;
        padding: .5em 1em;
        /* margin-left: 116px; */
        /* width: 80%; */
        /* width: 450px; */
        margin-bottom: 2em;
        background-color: white;
        
        
        font-size: 16px;
        justify-content: space-between;
        margin-left: auto;
    }


    .restaurant-info {
        display: flex;
        flex-grow: 1;
        justify-content: space-between;
}

    .restaurant-status {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        padding-left: 1em;
    }
    .restaurant-status p {
        align-self: flex-end;
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