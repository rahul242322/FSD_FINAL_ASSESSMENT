package com.FinalProject.finalProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalProject.finalProject.Exception.EntityNotFound;
import com.FinalProject.finalProject.entity.Hotel;
import com.FinalProject.finalProject.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	HotelRepository hotelRepository;

	public List<Hotel> fetchAllHotels() {

		return hotelRepository.findAll();
	}

	public Hotel create(Hotel hotel) {

		return hotelRepository.save(hotel);

	}

	public Hotel update(Hotel hotel, Long Id) {

		Optional<Hotel> optionalproduct = hotelRepository.findById(Id);

		if (optionalproduct.isPresent()) {
			Hotel updatedhotel = optionalproduct.get();
			updatedhotel.setName(hotel.getName());
			updatedhotel.setCity(hotel.getCity());
			updatedhotel.setEmail(hotel.getEmail());
			updatedhotel.setGym(hotel.getGym());
			updatedhotel.setImageUrl(hotel.getImageUrl());
			updatedhotel.setPool(hotel.getPool());
			updatedhotel.setRating(hotel.getRating());
			updatedhotel.setRoomPrice(hotel.getRoomPrice());
			updatedhotel.setWifi(hotel.getWifi());
			updatedhotel.setDescription(hotel.getDescription());

			hotelRepository.save(updatedhotel);

			return updatedhotel;
		}
		throw new EntityNotFound("Hotel record not Found");
	}
	
	
	public String delete(Long Id) {

		Optional<Hotel> optionalproduct = hotelRepository.findById(Id);
		if (optionalproduct.isPresent()) {
			hotelRepository.deleteById(Id);
			return "Hotel Deleted";
		}
		throw new EntityNotFound("The Hotel You want to delete is not present");
	}

}
