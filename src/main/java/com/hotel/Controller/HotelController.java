package com.hotel.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.Models.Hotels;
import com.hotel.Services.HotelServices;

@RestController
public class HotelController {
	
	@Autowired
	HotelServices hotelServices;
	
	@PostMapping("/createhotel")
	public Hotels create(@RequestBody Hotels hotels) {
		return hotelServices.createHotel(hotels);
	}
	
	@GetMapping("/getallhotel")
	public List<Hotels> getAllHotels() {
		return hotelServices.getallHotel();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Hotels> getHotelById(@PathVariable Long id) {
		return hotelServices.getHotelById(id);
	}
}
