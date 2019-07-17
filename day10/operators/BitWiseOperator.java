package com.training.day10.operators;

public class BitWiseOperator {
	
	public static void main(String args[]){
		int X = 60; // Binary Value : 0011 1100
		int Y = 13; // Binary Value : 0000 1101
		System.out.println("(X & Y) internal binary - 0000 1100 , Result = "+(X & Y));
		System.out.println("(X | Y) internal binary - 0011 1101 , Result = "+(X | Y));
		System.out.println("(X ^ Y) internal binary - 0011 0001 , Result = "+(X ^ Y));
		System.out.println("(~X) internal binary - 1100 0011 , Result = "+(~X));
		// Here int range is -127 to 128
		System.out.println("(X << 2) internal binary - 1111 0000, Result =  "+(X << 2));
		System.out.println("(X >> 3) internal binary - 0000 0111 , Result = "+(X >> 3));
		System.out.println("(X >>> 1) internal binary - 0001 1110 , Result = "+(X >>> 1));
	}

}
