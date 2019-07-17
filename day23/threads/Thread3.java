package com.trainining.day23.threads;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 201; i < 300; i++) {
			System.out.println("Thread Name : " +
		Thread.currentThread() + ", i : " +i);
		}
		
	}
}
