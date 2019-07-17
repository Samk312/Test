package com.trainining.day23.threads;

public class ThreadJoinExample2 {
	
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i=1; i<=10; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
				System.out.println("Thead1 printed from 1 to 10");
			}
		};
		
		final Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					t1.join(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i=11; i<=20; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
				System.out.println("Thead2 printed from 11 to 20");
			}
		};
		
		final Thread t3 = new Thread() {
			@Override
			public void run() {
				
				try {
					t2.join(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i=21; i<=30; i++) {
					System.out.println(Thread.currentThread().getName() + " : " + i);
				}
				System.out.println("Thead3 printed from 21 to 30");
			}
		};
		
		t3.start();
		t2.start();
		t1.start();
		
	}

}
