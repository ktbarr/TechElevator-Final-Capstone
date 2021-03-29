<template>
  <div class="container">
      <img class="smallerImage" src="@/assets/logos/vote_red_200x200.png" alt="Vote Swipe Right For Bytes">
       <h1 id="name">You've Invited To Vote on Where to Eat!</h1>
       <p> Simply give the places a thumbs up or a thumbs down! </p>
</template>

<script>

export default {
  name: "vote",
  components: { SearchResults, SearchForm}
};

</script>



<style scoped>
* {box-sizing: border-box;}

label {
  float: left;
}
input[type=text], [type=email], textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #ed1c24;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #666666;
}

.container {
  display: block;
    display: flex;
  flex-direction: column;
  margin:auto;
  text-align: center;
  border-radius: 5px;
  background-color: #ffffff;
    box-sizing: border-box;
  font-size: 14px;
  font-family: sans-serif;
  padding: 20px;
  width: 50%;
  background:
     url(../assets/Artboard_10.png)
     center / 100vw 
     no-repeat                
     fixed; 
}

.smallerImage{
  width:200px;
  display:flex;
  margin-left: 10px;
  margin-top: 10px;
}
</style>