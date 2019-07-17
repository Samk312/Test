package com.trainining.day23.threads;

public class Thread2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 101; i < 200; i++) {
			System.out.println("Thread Name : " 
		+Thread.currentThread() + ", i : " +i);
		}
	}

}
