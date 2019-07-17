package com.trainining.day22.threads;

public class FourthDaemonThread extends Thread {

	public void run() {

		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " : Daemon thread executing");
		} else {
			System.out.println(Thread.currentThread().getName() + " : user(normal) thread executing");
		}
	}

	public static void main(String[] args) {
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
		}
		FourthDaemonThread t1 = new FourthDaemonThread();
		// Making user thread t1 to Daemon
		t1.setDaemon(true);
		t1.setName("t1");
		
		FourthDaemonThread t2 = new FourthDaemonThread();
		t2.setName("t2");

		// starting both the threads
		t1.start();
		t2.start();
	}
}