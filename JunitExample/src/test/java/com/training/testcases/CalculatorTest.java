package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.Calculator;

class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("After each testcases");
	}

	@Test
	void testSum() {
		int actual = calculator.sum(10, 20);
	  assertEquals(30, actual);
	}
	
	@Test
	void testSub() {
		int actual = calculator.sub(-10, -20);
	  assertEquals(10, actual);
	}
	
	@Test
	void testMul() {
		int actual = calculator.mul(10, 20);
	  assertEquals(200, actual);
	}
	
	@Test
	void testDiv() {
		int actual = calculator.div(100, 20);
	  assertEquals(5, actual);
	}
	
	@Test
	void testAvg() {
		double actual = calculator.avg(10, 20, 30);
	  assertEquals(20, actual);
	}
	
	
	
	
	
	
	

}
