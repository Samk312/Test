package com.training.day4.abstractclass;

public class Four extends Three {

	@Override
	void test() {
		
		System.out.println("Test() method defined");
		// TODO Auto-generated method stub
		
	}

	// If you comment this below method , Four class should be declared as 
	// Abstract. else it will be CTE
	@Override
	void disp() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Four four = new Four();
		four.test();
	}
}
