package com.trainining.day23.threads;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread Name : " 
		+Thread.currentThread() + ", i : " +i);
		}
	}
}
