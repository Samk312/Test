package com.training.day10.operators;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		int X = 60;
		int Y = 13;
		X += 1;
		System.out.println("X+=1 : "+X);
		Y<<=1;
		System.out.println("Y<<=1 : "+Y);
		/* Return 26 : 13(binary - 00001101) shift one bit left means 26(00011010) */
	}

}
