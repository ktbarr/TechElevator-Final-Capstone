package com.techelevator.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.InviteSqlDAO;
import com.techelevator.dao.UserSqlDAO;
import com.techelevator.model.RestaurantNames;

@RestController
@CrossOrigin
public class InviteController {
	
	private UserSqlDAO dao;
	private InviteSqlDAO inviteDao;
	
	public InviteController(UserSqlDAO dao, InviteSqlDAO inviteDao) {
		this.dao = dao;
		this.inviteDao = inviteDao;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "/invite/{inviteName}", method = RequestMethod.POST)
	public void invites(@RequestBody RestaurantNames restaurantNames, @PathVariable String inviteName) {
//		String username = principal.getName();
//		long id = dao.findIdByUsername(username);
		System.out.println(inviteName);
		for (String name: restaurantNames.getRestaurantNames()) {
			System.out.println(name);
//			try {
//				inviteDao.createInvite(id, inviteName, name);
//			} catch (Exception e) {
//				System.err.println(name);
//			}

		}
			
	}

}
