package com.trainining.day22.threads;

public class MainDaemonOrNot {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is Daemon ? : " + Thread.currentThread().isDaemon());
	}

}
