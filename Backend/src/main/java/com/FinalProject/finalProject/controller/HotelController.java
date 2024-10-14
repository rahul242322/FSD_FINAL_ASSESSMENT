package com.FinalProject.finalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FinalProject.finalProject.beans.GlobalResponseHandler;
import com.FinalProject.finalProject.entity.Hotel;
import com.FinalProject.finalProject.service.HotelService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@GetMapping
	public ResponseEntity<Object> getAllHotels() {

		return GlobalResponseHandler.createResponse("Fecthed All Repsonse Sucessfully", hotelService.fetchAllHotels(),
				HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> saveHotel(@RequestBody Hotel hotel) {

		return GlobalResponseHandler.createResponse("Hotel Record is saved in DB successfully", hotelService.create(hotel),
				HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateHotel(@RequestBody Hotel hotel,@PathVariable Long id) {

		return GlobalResponseHandler.createResponse("Hotel Record is updated in DB successfully", hotelService.update(hotel,id),
				HttpStatus.CREATED);
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteHotel(@PathVariable Long id) {
		
		return GlobalResponseHandler.createResponse(hotelService.delete(id), HttpStatus.NO_CONTENT);
	}
	
	

}
