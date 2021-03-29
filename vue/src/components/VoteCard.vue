<template>
  
  <div id="container">
      <div id="main">
            <img class="smallerImage" src="@/assets/logos/vote_red_200x200.png" alt="Vote Swipe Right For Bytes">
       <h1 id="name">Vote!</h1>
       
          <div class="vote-card">

          </div>
      </div>
   </div>
</template>

<script>
export default {

    name: 'vote-card',
    props: ['vote', ],
    computed: {
        category() 
        {
            return this.$store.state.searchTerm;
        }
    }
}


</script>

</script>

<style scoped>
    #container {
        box-sizing: border-box;
    }
    #main {
        width: 100%;
        /* margin-left:auto; */
    }
    
    .vote-img {
        margin-right: 1.5em;
        width:125px;
    }

    .vote-card {
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


    .vote-info {
        display: flex;
        flex-grow: 1;
        justify-content: space-between;
}

    .vote-status {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        padding-left: 1em;
    }
    .vote-status p {
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