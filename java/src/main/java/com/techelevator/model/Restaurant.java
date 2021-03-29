package com.techelevator.model;

public class Restaurant {

	private String name;
	private String alias;
	private String phone;
	private String image_url;
	private String url;
	private boolean is_closed;
	private Location location;
	private String id;
	private String review_count;
	private String rating;
	private Categories[] category;
	private String display_phone;
	
	public Restaurant() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean getis_closed() {
		return is_closed;
	}

	public void setis_closed(boolean is_closed) {
		this.is_closed = is_closed;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getReview_count() {
		return review_count;
	}

	public void setReview_count(String review_count) {
		this.review_count = review_count;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Categories[] getCategories() {
		return category;
	}

	public void setCategories(Categories[] category) {
		this.category = category;
	}

	public String getDisplay_phone() {
		return display_phone;
	}

	public void setDisplay_phone(String display_phone) {
		this.display_phone = display_phone;
	}

}
