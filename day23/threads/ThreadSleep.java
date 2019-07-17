package com.trainining.day23.threads;

public class ThreadSleep extends Thread {
	
	@Override
	public void run() {
		
	for (int i=1;i<=100;i++) {
			
		System.out.println(Thread.currentThread().getName() + "--" + i);
		if (Thread.currentThread().getName().equals("first") && i==50) {
			try {
				Thread.currentThread().sleep(1000*60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
	}

	public static void main(String[] args) {
		
		ThreadSleep ts1 = new ThreadSleep();
		ts1.setName("first");
		ts1.start();
		
		ThreadSleep ts2 = new ThreadSleep();
		ts2.setName("second");
		ts2.start();
		
		

	}

}
