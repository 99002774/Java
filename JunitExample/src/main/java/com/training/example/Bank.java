package com.training.example;

public class Bank {
	
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public double withdraw( double amount) throws ExceedingException {
		if(amount > 4000 || amount == 8000) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount < 0) {
			throw new NegValueException("amount less than 0");
		}
		balance = balance-amount;
		return balance;
	}
	
	public double deposit( double amount) throws ExceedingException {
		if(amount > 8000) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<0) {
			throw new NegValueException("amount less than 0");
		}
		balance = balance+amount;
		return balance;
	}
	
	public double avg(double x, double y, double z) throws ExceedingException {
		double res = x+y+z;
		if(res>=300) {
			throw new ExceedingException("avg above 300");
		}
		if(res<=0) {
			throw new NegValueException("avg is equal to 0");
		}
		return res/3;
	}
}
