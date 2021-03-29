<template>
    <div class="container">
      <img class="smallerImage" src="@/assets/logos/logo_icon_only_redx200.png" alt="Swipe Right For Bytes">
       <h1 id="name">Share your top picks with your guests!</h1>
        <form @submit.prevent="sendEmail">
          <label>Name</label>
          <input 
            type="text" 
            v-model="name"
            name="name"
            placeholder="Your Name"
          >
          <label>Email</label>
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
          </textarea>
          
          <input type="submit" value="Send">
        </form>
    </div>
</template>

<script>
import emailjs from 'emailjs-com';

export default 
{
  name: 'ContactUs',
  data() {
    return {
      name: '',
      email: '',
      message: '',
      toEmail: ''
    }
  },
 methods:
  {
    sendEmail(e)
     {
      try 
      {
       emailjs.sendForm('default_service', 'template_qjho6na', e.target, 'user_z8vabOIBcYVeitkkfU4rS', {
          name: this.name,
          email: this.email,
          message: this.meessage
        })
        console.log('it works!!!')

      } catch (error) {
          console.log({error})
      }
      // Reset form field
      this.name = ''
      this.email = ''
      this.message = ''
    },
  }
}

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

 