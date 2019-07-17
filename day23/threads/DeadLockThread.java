package com.trainining.day23.threads;

public class DeadLockThread {
	
	public static void main(String[] args) {
		final DeadLock d1 = new DeadLock();
		final DeadLock d2 = new DeadLock();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("d1 hashcode in t1 : " + d1);
				System.out.println("d2 hashcode in t1 : " + d2);
				d1.method1(d2);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("d1 hashcode in t2 : " + d1);
				System.out.println("d2 hashcode in t2 : " + d2);
				d2.method2(d1);
			}
		};
		
		t1.start();
		t2.start();
	}

}
