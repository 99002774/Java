package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {

	@Override
	public void showMileage(double petrol) {
		// TODO Auto-generated method stub
		System.out.println("Car Mileage is " + petrol*20 );
		
	}

}
