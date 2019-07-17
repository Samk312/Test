package com.trainining.day24.threads;

public class BankAccount {
	
	int accountNumber = 1234;
	double accountBalance = 1000.00;
	
	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		return accountBalance;
	}

}
