package com.trainining.day23.threads;

public class ThreadsInJava {
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("Thread1");
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.setName("Thread2");
		t2.start();
		
		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3);
		t.setName("Thread3");
		t.start();
	}

}
