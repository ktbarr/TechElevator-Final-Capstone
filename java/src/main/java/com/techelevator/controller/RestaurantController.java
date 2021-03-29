package com.techelevator.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.techelevator.model.Businesses;
import com.techelevator.model.Restaurant;
import com.techelevator.services.RestaurantService;

@RestController
@CrossOrigin
public class RestaurantController {

	RestaurantService restaurantService = new RestaurantService();

	@PreAuthorize("permitAll()")
	@RequestMapping(value = "/restaurants/{keyword}/{location}", method = RequestMethod.GET)
	public Restaurant[] restaurantsNearMe(@PathVariable String keyword, @PathVariable int location) {
		try {
			return restaurantService.restaurants(keyword, location).getBusinesses();
		} catch (Exception ex) {
		}

		Restaurant[] restaurants = new Restaurant[5];
		for (int i = 0; i < 5; i++) {
			Restaurant r = new Restaurant();
			r.setId(i + "");
			r.setName("Restaurant " + i);
			restaurants[i] = r;
		}

		return restaurants;

	}

}
