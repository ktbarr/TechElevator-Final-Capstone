package com.techelevator.model;

public class Invite {
	
	public String userId;
	public String restaurantName;
	public String inviteName;

	public Invite(String userId, String restaurantName, String inviteName) {
		this.userId = userId;
		this.restaurantName = restaurantName;
		this.inviteName = inviteName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getInviteName() {
		return inviteName;
	}

	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
	}
}
