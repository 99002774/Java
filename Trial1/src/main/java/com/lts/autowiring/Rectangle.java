package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component("shape")
public class Rectangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub

		System.out.println("Area : " + x*y);
		
	}
	
	
}
