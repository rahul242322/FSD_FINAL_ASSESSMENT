package com.FinalProject.finalProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Long roomPrice;
	
	private String imageUrl;
	
	private String description;
	
	private String rating;
	
	private String city;
	
	private String email;
	
	private String wifi;
	
	private String gym;
	
	private String pool;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Long roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getGym() {
		return gym;
	}

	public void setGym(String gym) {
		this.gym = gym;
	}

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", roomPrice=" + roomPrice + ", imageUrl=" + imageUrl
				+ ", description=" + description + ", rating=" + rating + ", city=" + city + ", email=" + email
				+ ", wifi=" + wifi + ", gym=" + gym + ", pool=" + pool + "]";
	}
	
	
	
	
	

	
	

}
