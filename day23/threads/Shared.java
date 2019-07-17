package com.trainining.day23.threads;

public class Shared {
	int i;
	
	public void m1() {
		for (i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
