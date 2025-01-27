package com.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.Models.Hotels;

@Repository
public interface HotelRepository extends JpaRepository<Hotels, Long> {
	
}
