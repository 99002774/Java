package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDAO hoteldao;
	
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
