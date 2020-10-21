package com.hotelapp.client;

import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

public class User {
	public static void main(String[] args) {
		HotelService hotelservice = new HotelServiceImpl();
		List<Hotel> hotelList = hotelservice.getAllHotels();
		Integer id = 2;
		String city = "blore";
		System.out.println(hotelservice.getById(id));
		System.out.println(hotelservice.getByCity(city));
		for(Hotel hotel : hotelList) {
			System.out.println(hotel);
		}
		
	}

}
