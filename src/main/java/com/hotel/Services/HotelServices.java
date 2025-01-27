package com.hotel.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Models.Hotels;
import com.hotel.Repository.HotelRepository;

@Service
public class HotelServices {
	
	@Autowired
	HotelRepository hotelRepository;
	
	public Hotels createHotel(Hotels hotels) {
		return hotelRepository.save(hotels);
	}
	
	public List<Hotels> getallHotel() {
		return hotelRepository.findAll();
	}
	
	public Optional<Hotels> getHotelById(Long id) {
		return hotelRepository.findById(id);
	}
}
