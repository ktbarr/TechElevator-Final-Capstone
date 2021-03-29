<template>
 <div id="footer">
   <div class="container"></div>
   <p>
     <img class="icon" src="@/assets/logos/logo_main.png">
    </p>
    <h1>Swipe Right for Bytes</h1>
   </div> 
</template>

<script>
export default {
  name: 'footer',

}
</script>

<style>
.container
{
  display:flex;
  align-content:center;
  border-bottom: 1px solid red;
  margin: 3em 0;

}
#footer{
  display:flex;
  margin-bottom: 3em;
  font-size:10px;
}
.icon {
  height: 20px;
  display:flex;
  margin-bottom: -5px;
}
</style>