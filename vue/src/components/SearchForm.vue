<template>
<body>
   <div id="searchForm">
    <label id="inputLabel" for="category">What are you in the mood for?</label>
    <input id="searchCriteria" type="text" v-model="category" v-on:blur="isCategoryValid=category !=''">
    <div class="errorMessage" v-if="!isCategoryValid">Please enter a category</div>
    <label id="inputLabel" for="category">Zip Code:</label>
    <input id="searchCriteria" type="text" v-model="zipCode" v-on:keydown="numberKeyPress" v-on:blur="isZipCodeValid=zipCode.length == 5">
    <div class = "errorMessage" v-if="!isZipCodeValid">Please enter valid zip code</div>
    <br><br>
    <button id="searchButton" v-on:click="search">Search</button>
      <div id="inviteLink"> 
    <label v-if="$store.state.searchResults.length !== 0" id="inputLabel" for="inviteName">Name of Event: </label>
    <input v-if="$store.state.searchResults.length !== 0" id="inviteName" type="text" v-model="inviteName">
    <button v-on:click="invite" id="inviteButton" v-if="$store.state.searchResults.length !== 0">Invite Guests</button>
  </div>
  </div>

</body>
  
 
</template>

<script>
import restaurantService from "@/services/RestaurantService";

export default {
  name: "SearchForm",
  data() {
    return {
      category: '',
      zipCode: '',
      city: '',
      isCitySearch: false,
      isCategoryValid: true,
      isZipCodeValid: true,
      searchResult: [],
      inviteName: ''
    }
  },
  methods: {
    search() {
      this.$store.commit('SET_SEARCH_TERM', this.category);
      this.$store.commit('SET_SEARCH_ZIP', this.zipCode);
      
      if(this.isZipCodeValid && this.isCategoryValid){
          restaurantService.searchByZip(this.category, this.zipCode).then((results) => {
            // store the result in the store
            //this.searchResult = results.data;
            this.$store.commit('SET_SEARCH_RESULTS', results.data);
          });
      }
    },
    invite() {
      if (this.inviteName) {
        restaurantService.invite(this.inviteName, this.$store.state.searchResults.map(obj => obj.name))
                         .then(() => this.$router.push(`/invite/${this.category}/${this.zipCode}`));
              }
      
      
    },
    numberKeyPress(event)
    {
      const allowedKeys=[
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
      ] 
      let isAllowed = allowedKeys.filter(key=> key == event.key).length > 0;
      isAllowed = isAllowed && this.zipCode.length < 5;
      if (event.key == "Enter" || event.key == "Backspace" || event.key == "Delete")
      {
        isAllowed = true;
      }
      if(!isAllowed)
      {
        event.preventDefault();
      }
    }
  }
}
</script>

<style scoped>
#searchCriteria {
    margin-bottom: 1em;
    border-radius: 3px;
    padding-top: 15px;
    padding-bottom: 15px;
    width: 18%;
}

#searchForm {
  height: 100vh;
}

#searchForm, #inviteLink {
  display: flex;
  flex-direction: column;
}

#inviteLink {
  padding-top: 20px;
}

#searchButton, #inviteButton{
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
#inviteButton {
  margin-top: .5em;
}

#inviteName{
  margin-bottom: 1em;
  border-radius: 3px;
  padding-top: 15px;
  padding-bottom: 10px;
  width: 18%;
}

#inputLabel{
  
  font-size: 20px;
  width: 20%;
  padding-top: 20px;

}
.errorMessage{
  color:#ed1c24;
  font-size: 15px;
  margin-block: 3px;


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
