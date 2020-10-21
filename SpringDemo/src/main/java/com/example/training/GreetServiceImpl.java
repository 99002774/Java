package com.example.training;

import org.springframework.stereotype.Service;

@Service

public class GreetServiceImpl implements GreetService{
	public String greet(String name) {
		return "Welcome "+ name;
		
	}

}
