package com.techelevator.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.UserZipcode;
import com.techelevator.services.UserZipcodeServices;

@RestController
@CrossOrigin
public class UserLocationController {

	UserZipcodeServices zipService = new UserZipcodeServices();

	@PreAuthorize("permitAll()")
	@RequestMapping(value = "/userzip/{city}/{state}", method = RequestMethod.GET)
	public UserZipcode zipCodeByCity(@PathVariable String city, @PathVariable String state) {
		
			return zipService.zipcodeByCity(city, state);
	}

}
