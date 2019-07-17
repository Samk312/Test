package com.trainining.day22.threads;

public class FinalizeDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		Student s1 = new Student(1,"varun");
		Student s2 = new Student(2,"kumar");
		Student s3 = new Student(3, "Reddy");
		
		s3 = null;
		s2 = s1;
		
		System.gc();
	}
}
