package com.trainining.day23.threads;

public class DeadLock {
	
	public synchronized void method1(DeadLock d) {
		System.out.println(Thread.currentThread().getName() + " is executing method1");
		System.out.println(Thread.currentThread().getName() + " is calling method2");
		System.out.println("this in method1" + this);
		d.method2(this);
		System.out.println(Thread.currentThread().getName() + " is finished executing method1");
		
	}

	public synchronized void method2(DeadLock d) {
		System.out.println(Thread.currentThread().getName() + " is executing method2");
		System.out.println(Thread.currentThread().getName() + " is calling method1");
		System.out.println("this in method2" + this);
		d.method1(this);
		System.out.println(Thread.currentThread().getName() + " is finished executing method2");
	}
}
