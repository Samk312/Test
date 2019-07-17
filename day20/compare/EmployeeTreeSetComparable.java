package com.training.day20.compare;

import java.util.TreeSet;

public class EmployeeTreeSetComparable {
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		
		Employee e1 = new Employee(606670, "Varun", 2000.00);
		Employee e2 = new Employee(646907, "Neethu", 2000.00);
		Employee e3 = new Employee(345, "Sai Ram", 20000.00);
		Employee e4 = new Employee(1234, "Guru", 3235.00);
		Employee e5 = new Employee(2435, "Palvai", 12000.00);
		Employee e6 = new Employee(1563, "Rupa", 24500.00);
		//Scenario 1 : With out implementing Comparable interface
		// If we won't implement Comparable interface on the object of a class which we are trying 
		// to add to Treeset,We will get Class Cast Exception as per below.
		// Exception in thread "main" java.lang.ClassCastException: com.training.day20.compare.Employee 
		// cannot be cast to java.lang.Comparable
		
		// Scenario 2: With implemeting Comparable interface
		ts.add(e1);  
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		
		
		
		System.out.println(ts); // If we won't implement 
	}

}
