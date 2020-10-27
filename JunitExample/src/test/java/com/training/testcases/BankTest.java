package com.training.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegValueException;

class BankTest {

	Bank bank;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Init");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Destroy");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before test");
		bank = new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Test");
		bank = null;
	}

	@Test
	void testWithdraw() throws ExceedingException {
		double balance = bank.withdraw(2000);
		assertEquals(6000, balance,"should be 6000");
	}

	@Test
	void testWithdrawExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(4100));
	}
	
	@Test
	void testWithdrawNeg() {
		assertThrows(NegValueException.class,()->bank.withdraw(-900));
	}
	
	@Test
	void testWithdrawEq() {
		assertThrows(ExceedingException.class,()->bank.withdraw(8000));
	}
	
	@Test
	void testDeposit() throws ExceedingException {
		double balance = bank.deposit(2000);
		assertEquals(10000, balance,"should be 10000");
		
	}
	
	@Test
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.deposit(9000));
	}
	
	@Test
	void testDepositNeg() {
		assertThrows(NegValueException.class,()->bank.deposit(-900));
	}
	
	@Test
	void testAvg() throws ExceedingException{
		double balance = bank.avg(10, 20, 30);
	  assertEquals(20, balance);
	}
	
	
	
	@Test
	void testAvgExceeding() {
		assertThrows(ExceedingException.class,()->bank.avg(300,200,100));
	}
	
	@Test
	void testAvgNeg() {
		assertThrows(NegValueException.class,()->bank.avg(-900,0,-700));
	}
	

}
