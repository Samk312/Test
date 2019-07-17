package com.training.day4.abstractclass;

public class OneTest extends One {

	@Override
	void test() {
		System.out.println("In test() of AbstractDemoTest");
		
	}
	
	public static void main(String[] args) {
		OneTest ot = new OneTest();
		ot.test();
		System.out.println(ot.i);
	}

}
