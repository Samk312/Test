package com.trainining.day24.threads;

public class TestAccountBalance {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Thread bat1 = new BankAccountThread(ba);
		Thread bat2 = new BankAccountThread(ba);
		
		bat1.setName("Thread-1");
		bat2.setName("Thread-2");
		
		bat1.start();
		bat2.start();
	}

}
