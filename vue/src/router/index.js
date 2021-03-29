import Vue from 'vue'
import Router from 'vue-router'
import NavBar from '../components/NavBar.vue'
import Home from '../views/Home.vue'
import Splash from '@/views/SplashPage.vue'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Register from '../views/Register.vue'
import store from '../store/index'
import Restaurants from '../views/Restaurants.vue'
import RestaurantDetails from '../views/RestaurantDetails.vue'
import ContactForm from '../components/ContactForm.vue'
import Footer from '../components/Footer.vue'
import Invite from '@/views/Invite.vue'


Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
     
      
        path:"/",
        name: "splash",
        component: Splash,
        meta:{
          requiresAuth: false
        }
    },
    
    
    {
      path:"/home",
      name: "home",
      component: Home,
      meta:{
        requiresAuth: true
      }
    },
    
    {
      path: "/login",
      name: "login",
      component: Login,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/logout",
      name: "logout",
      component: Logout,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/register",
      name: "register",
      component: Register,
      meta: {
        requiresAuth: false
      }
    },
    {
      path:"/restaurants",
      name: "restaurants",
      component: Restaurants,
      meta:{
        requiresAuth: true
      }
    },
    {
      path:"/restaurantDetails",
      name: "restaurantDetails",
      component: RestaurantDetails,
      meta:{
        requiresAuth: true
      }
    },

    {
      path:"/contactForm",
      name: "contactForm",
      component: ContactForm,
      meta:{
        requiresAuth: true
      }
    },

    {
      path:"/navBar",
      name: "navBar",
      component: NavBar,
      meta:{
        requiresAuth: false
      }
    },

    {
      path:"/footer",
      name: "footer",
      component: Footer,
      meta:{
        requiresAuth: false
      }
    },
    {
      path:"/invite/:category/:zipCode",
      name: "invite",
      component: Invite,
      meta:{
        requiresAuth: true
      }
    }
    
  ]
})

router.beforeEach((to, from, next) => {
  // Determine if the route requires Authentication
  const requiresAuth = to.matched.some(x => x.meta.requiresAuth);

  // If it does and they are not logged in, send the user to "/login"
  if (requiresAuth && store.state.token === '') {
    next("/login");
  } else if(!requiresAuth && store.state.token !== '') {
    next("/home")
  } else {
    // Else let them go to their next destination
    next();
  }
});

export default router;
