package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda{
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	@Autowired
	@Qualifier("indian")
	Menu iMenu;
	public List<String> showMenu(String choice) {
		
		if(choice.equals("indian"))
			return iMenu.itemsAvaialble();
		if(choice.equals("chinese"))
			return cMenu.itemsAvaialble();
		
		return null;
	}

}
