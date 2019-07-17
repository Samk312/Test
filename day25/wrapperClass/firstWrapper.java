package com.training.day25.wrapperClass;

public class firstWrapper {
	
	public static void main(String[] args) {
		
		int k = 130;
		byte b = (byte)k; // explicit type casting
		
		System.out.println(b);
		
		int i = 10;
		Integer intObject = i; // auto boxing
		System.out.println("Equalent Double : " + intObject.doubleValue());
		System.out.println("Equalent int : " + intObject.intValue());
		
		Integer intObj = new Integer(20);
		int j = intObj;
		System.out.println(j);
		
		short s = (short)intObj.intValue();
		System.out.println(s);
		
		double d = 30.35;
		int l = (int)d;
		float f = (float)d;
		System.out.println(l);
		System.out.println(f);
		
		Double dObj = new Double(30.35);
		System.out.println("Equalent int value : " + dObj.intValue());
		System.out.println("Equalent float value : " + dObj.floatValue());
		
		
		
	}

}
