<template>
  <div id="container">
    <img id="registerLogo" src="@/assets/logos/logo_main.png" alt="Swipe Right For Bytes">
    <body>
      <h1 id="name">Share your top picks with your guests!</h1>
      <ul>
          <li v-bind:key="link.id" v-for="link in guestLinks">{{link}}</li>
      </ul>
        <form @submit.prevent="generateLink">
          <label>Name of Guest:</label>
          <input 
            type="text" 
            v-model="guestName"
            name="name"
            
          >
          <!--<label>Email</label>
          <input 
            type="email" 
            v-model="email"
            name="email"
            placeholder="Your Email"
            >
            <label>Recipient Email</label>
          <input 
            type="email" 
            v-model="toEmail"
            name="toEmail"
            placeholder="Email of Recipient"
            >
          <label>Message</label>
          <textarea 
            name="message"
            v-model="message"
            cols="30" rows="5"
            placeholder="Message">
          </textarea>-->
          
          <input type="submit" value="Generate Unique Voting Link">
        </form>
        </body>
        <img id="voting" src="@/assets/thumbs_up_voting.jpg" alt="Vote Mock Up">
  </div>
</template>

<script>
export default {
    name: 'invite',
    data() {
        return {
            guestName: '',
            guestLinks: []
        }
    },
    methods: {
        generateLink() {
            let rand = Math.floor(Math.random()*101 + 10);
            
            this.guestLinks.push( `${process.env.VUE_APP_REMOTE_API}/invite/${this.$route.params.category}/${this.$route.params.zipCode}/${this.guestName}/${rand}`);
        }
    }
        
}
</script>

<style scoped>
* {box-sizing: border-box;}

label {
  float: left;
  font-size: 20px;
  font-family: sans-serif;
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

#container {
  display: block;
    display: flex;
  flex-direction: column;
  margin:auto;
  text-align: center;
  align-items: center;
  border-radius: 5px;
  background-color: #ffffff;
    box-sizing: border-box;
  font-size: 14px;
  font-family: sans-serif;
  padding: 20px;
  width: 100%;
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

#voting{
  width: 75vw;
}
</style>