package com.lts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements Menu{

	@Override
	public List<String> itemsAvailable() {
		return Arrays.asList("Noodles", "Fried Rice");
	}

}
