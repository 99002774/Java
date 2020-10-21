package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		Integer res = (int) (0.5 * (x * y));
		System.out.println("Area :" + res );
	}
	
	
	
	
}
