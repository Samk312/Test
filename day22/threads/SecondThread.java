package com.trainining.day22.threads;

public class SecondThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Implemented run() method");
	}
	
	public static void main(String[] args) {
		SecondThread st = new SecondThread();
		st.start();
		st.run();
	}
	
	

}
