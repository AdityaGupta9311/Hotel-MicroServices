package com.hotel.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotels {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String hotelName;
	private String adress;
	private long pincode;
	private String city;
	
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotels(long id, String hotelName, String adress, long pincode, String city) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.adress = adress;
		this.pincode = pincode;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
