package com.techelevator.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.Businesses;
import com.techelevator.model.Restaurant;

public class RestaurantService {

	private String BASE_URL = "https://api.yelp.com/v3/businesses/";
	private RestTemplate template = new RestTemplate();


	public Businesses restaurants(String searchTerm, int location) {

		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.add("Authorization",
				"Bearer yhUWMwOQygNXg9x1OuKlH9NpxNsYbwwrqiCSPROkV5O1QpD-t5-YxgUyIGHWhwbwFpGTqMMg3UuRNvm2ISfPBxgGwZNfr4brMvtDNTxs30Bww0SoBumetD4gW_pIYHYx");
		HttpEntity<?> entityForGet = new HttpEntity<Object>(httpHeader);
		ResponseEntity<Businesses> entity = template.exchange(
				BASE_URL + "search?term=" + searchTerm + "&location=" + location, HttpMethod.GET, entityForGet,
				Businesses.class);
		Businesses restaurants = entity.getBody();

		return restaurants;
	}
}
