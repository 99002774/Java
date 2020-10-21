package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for( Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==id)
			{
				return hotel;
			}
		}
		
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine)) {
				newHotelList.add(hotel);
				}
		}
		return newHotelList;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel("kfc",1,"blore","mexican"),
				new Hotel("dominos",2,"chn","continental"),
				new Hotel("mcd",3,"mys","mexican"),
				new Hotel("rr",4,"mdu","indian")
				);
	}

}
