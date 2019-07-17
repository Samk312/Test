package com.trainining.day23.threads;

public class ThreadInference {
	public static void main(String[] args) {
		final Shared s = new Shared();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				s.m1();
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				s.m1();
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
