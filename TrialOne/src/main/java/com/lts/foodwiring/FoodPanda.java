package com.lts.foodwiring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lts.autowiring.Shape;

import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
	
	@Autowired
	@Qualifier("indian")
	Menu iMenu;
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	
	ArrayList<String> food = new ArrayList<String>();
	
	public List<String> showMenu(String choice) {
		if(choice.equals("Indian"))
		{
			return iMenu.itemsAvailable();
		}
		if(choice.equals("Chinese"))
		{
			return cMenu.itemsAvailable();
		}
		return null;
	}
}
