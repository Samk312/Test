package com.training.day13.equals;

import java.util.HashMap;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("Varun");
		e1.setDesignation("TL");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(102);
		e2.setEmployeeName("Kiran");
		e2.setDesignation("TL");
		
		Employee e3 = new Employee();
		e3.setEmployeeId(101);
		e3.setEmployeeName("Varun");
		e3.setDesignation("TL");
		
		if (e1 == e2) {
			System.out.println("e1 and e2 are same using '==' operator :");
		} else {
			System.out.println("e1 and e2 are not same using '==' operator :");
		}
		
		if (e2 == e3) {
			System.out.println("e2 and e3 are  same using '==' operator :");
		} else {
			System.out.println("e2 and e3 are not same using '==' operator :");
		}
		
		if (e1 == e3) {
			System.out.println("e1 and e3 are same using '==' operator :");
		} else {
			System.out.println("e1 and e3 are not same using '==' operator :");
		}
		
		System.out.println("We can say two objects are same only if their equals() and hashcode() method returs true.");
		System.out.println("if atleast one returns false we can say that both objects are not same");
		if (e1.equals(e2)) {
			System.out.println("e1 and e2 are same using e1.equals(e2):");
		} else {
			System.out.println("e1 and e2 are not same using e1.equals(e2):");
		}
		
		if (e2.equals(e3)) {
			System.out.println("e2 and e3 are same using e2.equals(e3) :");
		} else {
			System.out.println("e2 and e3 are not same using e2.equals(e3) :");
		}
		
		// With out overriding hashcode
		HashMap m = new HashMap();
		
		/*
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		m.put(e1, e1);
		m.put(e2, e2);
		
		System.out.println(m);
		
		if (e1.equals(e3) && e1.hashCode() == e3.hashCode()) {
			System.out.println("e1 and e3 are same as  e1.equals(e3) returns : "+e1.equals(e3)+" and e1.hashCode() == e3.hashCode() returns " + (e1.hashCode() == e3.hashCode()));
		} else {
			System.out.println("e1 and e3 are not same though e1.equals(e3) returns : "+e1.equals(e3)+" but e1.hashCode() == e3.hashCode() returns " + (e1.hashCode() == e3.hashCode()));
		}
		
		*/
		
		// With overriding hashcode
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		m.put(e1, e1);
		m.put(e2, e2);
		m.put(e3, e3);
		
		System.out.println(m);
		
		if (e1.equals(e3) && e1.hashCode() == e3.hashCode()) {
			System.out.println("e1 and e3 are same as  e1.equals(e3) returns : "+e1.equals(e3)+" and e1.hashCode() == e3.hashCode() returns " + (e1.hashCode() == e3.hashCode()));
		} else {
			System.out.println("e1 and e3 are not same though e1.equals(e3) returns : "+e1.equals(e3)+" but e1.hashCode() == e3.hashCode() returns " + (e1.hashCode() == e3.hashCode()));
		}
		
		
		
		
		
	}

}
