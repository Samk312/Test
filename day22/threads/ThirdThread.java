package com.trainining.day22.threads;

public class ThirdThread extends Thread {
	
	@Override
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Thread-1")) {
			addition();
		} else if (Thread.currentThread().getName().equalsIgnoreCase("Thread-2")) {
			subtraction();
		}
	}

	public static void main(String[] args) {
		ThirdThread t1 = new ThirdThread();
		t1.setName("Thread-1");
		//t1.setPriority(MAX_PRIORITY);
		
		t1.start();
		
		ThirdThread t2 = new ThirdThread();
		t1.setName("Thread-2");
		//t1.setPriority(MIN_PRIORITY);
		
		t2.start();;
	}
	
	public void addition() {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result = result + 1;
			System.out.println(" + result : " + result);
		}
		System.out.println("Addition Result" + result);
	}
	
	public void subtraction() {
		int result = 300;
		for (int i = 0; i <=100; i++) {
			result = result - 1;
			System.out.println(" - result : " + result);
		}
		System.out.println("Subtraction Result" + result);
	}

}
