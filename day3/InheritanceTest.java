package com.training.day3;

public class InheritanceTest {
	
	public static void main(String[] args) {
//		Parent p1 = new Parent();
//		System.out.println(p1.i);
//		System.out.println(p1.j);
//		p1.m1();
//		p1.m2();
//		
//		System.out.println("*********");
		
//		Child c  = new Child();
//		System.out.println(c.i);
//		System.out.println(c.j);
//		c.m1();
//		c.m2();
//		
//		System.out.println("*********");
		
		Parent p = new Child();
//		//p is of type Parent , and p is pointing to child object
//		System.out.println(p.i);
//		System.out.println(p.j);
//		p.m1();
//		p.m2();
//		p.m3();
		
		//Type casting
		Child c1 = (Child)p;
		
		System.out.println(c1.i);
		System.out.println(c1.j);
		c1.m1();
		c1.m2();
	}
}
