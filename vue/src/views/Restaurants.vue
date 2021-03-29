<template>
  <div id="container" class="restaurants">
    <img class="smallerImage" src="@/assets/search_red.png" alt="microscope">
    <h1 id="searchHeader" class="h3 mb-3 font-weight-normal">Restaurant Search</h1>
    <search-form />
    <hr>
   
    <search-results />
    
  </div>
 
</template>

<script>
import SearchForm from "@/components/SearchForm";
import SearchResults from "@/components/SearchResults";
export default {
  name: "restaurants",
  components: { SearchResults, SearchForm}
};
</script>

<style scoped>
#searchHeader{
  display:flex;
  font-family: sans-serif;
  color: #ed1c24;
  font-size: 25px;
  margin-top: 20px;
  margin-left: 15px;
  /* margin-bottom: 4em; */
}

#searchForm {
  
  margin-bottom: 2em;
  margin-top: -75px;
  
}

  #container {
  display: flex;
  flex-direction: column;
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


.smallerImage{
  width:100px;
  display:flex;
  margin-left: 30px;
  margin-top: 20px;
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


