package com.training.day4.abstractclass;

public class Eight extends Seven {

	@Override
	void m3() {
		System.out.println("I am in m3()");
	}
	
	public static void main(String[] args) {
		Eight eight = new Eight();
		eight.m1();
		eight.m2();
		eight.m3();
		
		System.out.println("****************");
		//Six six = new Six(); // CTE
		//Six six = new Seven();// CTE
		Six six = new Eight(); //six is of type SIX and is pointing to Eight object.
		six.m1();
		six.m2();
		six.m3();
	}

}
