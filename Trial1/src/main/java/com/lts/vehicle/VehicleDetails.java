package com.lts.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
		@Autowired
		@Qualifier("car")
		MileCalculator car;
		@Autowired
		@Qualifier("bike")
		MileCalculator bike;
		
		public void getMileage(double petrol,String choice) {
		if(choice.equals("car")) {
			car.showMileage(petrol);
		}
		else {
			bike.showMileage(petrol);
		}
	}
	
}
