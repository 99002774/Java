package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.vehicle.VehicleDetails;

@SpringBootApplication
public class TrialOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrialOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		//Employee employee = context.getBean("employee", Employee.class);
		//System.out.println(employee);
		
		//Student student = context.getBean("student", Student.class);
		//System.out.println(student);
		
		//ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		//shapeFactory.printArea(10,20);
		
		//FoodPanda foodPanda = context.getBean(FoodPanda.class);
		//List<String> foodlist = foodPanda.showMenu("Indian");
		
	//	for(String food : foodlist)
		//{
		//	System.out.println(food);
	//	}
		
		VehicleDetails vehicleDetails = context.getBean(VehicleDetails.class);
		vehicleDetails.getMileage("car");
	}
	
}
