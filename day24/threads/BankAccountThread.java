package com.trainining.day24.threads;

public class BankAccountThread extends Thread {
	
    BankAccount bankAccount = null;
    
    public BankAccountThread(BankAccount bankAccount) {
    		this.bankAccount = bankAccount;
    }
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": Started");
		
		double accountBalance = bankAccount.deposit(200.00);
		System.out.println(Thread.currentThread().getName() + ": Ended" + 
		" , Account Balance : " + accountBalance);
	}

}
