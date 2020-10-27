package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotel")
	public List<Hotel> showAllHotel(){
		return hotelService.getAllHotels();
	}
	@GetMapping("/hotel-by-city/{city}")
	public List<Hotel> showHotelByCity(@PathVariable("city")String city){
		return hotelService.getByCity(city);
	}
	@GetMapping("/hotel-by-cuisine/{cuisine}")
	public List<Hotel> showHotelByCuisine(@PathVariable("cuisine")String cuisine){
		return hotelService.getByCuisine(cuisine);
	}
	@GetMapping("/hotel-by-id/{id}")
	public Hotel showHotelById(@PathVariable("id")int id){
		return hotelService.getById(id);
	}
	
}
