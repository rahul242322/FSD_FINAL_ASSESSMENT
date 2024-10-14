package com.FinalProject.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.finalProject.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	

}
