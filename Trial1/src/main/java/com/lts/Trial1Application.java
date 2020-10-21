package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.foodwiring.FoodPanda;

@SpringBootApplication
public class Trial1Application implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(Trial1Application.class, args);
	}

	@Autowired
	ApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);*/
		
		ShapeFactory shapeFactory = context.getBean("shapeFactory",ShapeFactory.class);
		shapeFactory.printArea(20, 10);
		
		FoodPanda foodPanda = context.getBean("foodPanda",FoodPanda.class);
		List<String> menuList =  foodPanda.showMenu("indian"); 
		for(String iterator : menuList)
			System.out.println(iterator);
		
	}
		
	

}
