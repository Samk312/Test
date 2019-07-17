package com.training.day14.exceptions;

public class ThirdException {
	/*
	public static void main(String[] args) throws Exception {
		
		int age=10;
		if (age <18) {
			throw new Exception("you are not eligible to cast vote");
		} else {
			System.out.println("you are eligible to cast vote");
		}
	}*/
	
	public static void main(String[] args) {
		
		int age=10;
		if (age <18) {
			try {
				throw new Exception("you are not eligible to cast vote");
			} catch (Exception e) {
				e.printStackTrace();
				//System.out.println("exception occured : " + e.getMessage());
			}
			System.out.println("Dummy");
		} else {
			System.out.println("you are eligible to cast vote");
		}
	}
	
	

}
