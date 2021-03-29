package com.techelevator.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.UserZipcode;

public class UserZipcodeServices {
	
	private String ZIP_BASE_URL = "https://app.zipcodebase.com/api/v1/code/city?apikey=701a0200-82cd-11eb-a72b-834585f48364";
	private RestTemplate template = new RestTemplate();


	public UserZipcode zipcodeByCity(String city, String state) {
		
		ResponseEntity<UserZipcode> response = template.getForEntity(ZIP_BASE_URL + "&city=" + city + "&state_name=" + state + "&country=us", UserZipcode.class);
		
		UserZipcode currentZipcode = response.getBody();

		return currentZipcode;
	}
}
