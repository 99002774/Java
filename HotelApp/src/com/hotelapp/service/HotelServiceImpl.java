package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService {

	HotelDAO hoteldao = new HotelDAOImpl();
	
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hoteldao.getAllHotels();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		return hoteldao.getById(id);
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hoteldao.getByCity(city);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hoteldao.getByCuisine(cuisine);
	}

}
