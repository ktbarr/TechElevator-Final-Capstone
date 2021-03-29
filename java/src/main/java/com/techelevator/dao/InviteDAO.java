package com.techelevator.dao;

public interface InviteDAO {
	
	boolean createInvite(long userId, String inviteName, String restaurantName);

}
