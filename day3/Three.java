package com.training.day3;

import com.training.day4.One;

public class Three extends One {

	public static void main(String[] args) {

		// Since we created o in another package , 
		//we can access only public variables/methods.
		One  o = new One();
		System.out.println(o.name4); 
		o.m4();
		
		// since o is created in another package, 
		//we can't access protected variables/methods.
		//System.out.println(o.name2);  
		//o.m2(); 
		
		Three t = new Three();
		System.out.println(t.name2); // since t is a 
		//subclass of One, t can access protected 
		//variables/methods 
		//of One class
		t.m2();
	}

}
