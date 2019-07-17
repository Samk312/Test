package com.training.day20.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class FirstComparator {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Varun", "ECE", "TKR");
		Student s2 = new Student(2, "Kumar", "ECE", "TKR");
		Student s3 = new Student(3, "Reddy", "ECE", "TKR");
		
		Student s4 = new Student(1, "Kiran", "ECE", "GNEC");
		Student s5 = new Student(2, "Yuvraj", "ECE", "GNEC");
		Student s6 = new Student(3, "Arshith", "ECE", "GNEC");
		
		Student s7 = new Student(1, "Virat", "EEE", "GNEC");
		Student s8 = new Student(2, "Yuraj", "EEE", "TKR");
		Student s9 = new Student(3, "Sachin", "EEE", "TKR");
		
		Student s10 = new Student(1, "Virat", "ECE", "TKR");
		Student s11 = new Student(2, "Bravo", "EEE", "GNEC");
		Student s12 = new Student(3, "Smith", "EEE", "GNEC");
		
		Student s13 = new Student(1, "Cook", "MECH", "TKR");
		Student s14 = new Student(2, "Kawaja", "MECH", "TKR");
		Student s15 = new Student(3, "Warner", "MECH", "TKR");
		
		Student s16 = new Student(1, "Cook", "EEE", "GNEC");
		Student s17 = new Student(2, "Anderson", "MECH", "GNEC");
		Student s18 = new Student(3, "Taylor", "MECH", "GNEC");
		
		Student s19 = new Student(1, "Virat", "EEE", "TKR");
		Student s20 = new Student(1, "Virat", "ECE", "GNEC");
		
		ArrayList al = new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		al.add(s11);
		al.add(s12);
		al.add(s13);
		al.add(s14);
		al.add(s15);
		al.add(s16);
		al.add(s17);
		al.add(s18);
		al.add(s19);
		al.add(s20);
		
		
		for(Object s : al) {
			System.out.println((Student)s);
		}
		
		
		//System.out.println("****************");
		//1. sort by Id
		
		//Collections.sort(al, Student.SORT_BY_ID);
		
		//System.out.println("After sorting based on Id");
		
		//for(Object s:al) {
			//System.out.println((Student)s);
		//}
//		
		System.out.println("****************");
		
		//2. Sort by Id & name
		System.out.println("After sorting based on Id & Name");
		Collections.sort(al, Student.SORT_BY_ID_NAME);
		
		for(Object s:al) {
			System.out.println((Student)s);
		}
		
		System.out.println("****************");
		
		//3. Sort by Id,Name & Branch
		System.out.println("After sorting based on Id, Name & Branch");
		Collections.sort(al, Student.SORT_BY_ID_NAME_BRANCH);
		
		for(Object s:al) {
			System.out.println((Student)s);
		}
		
		System.out.println("****************");
		
		//4. Sort by Id,Name,Branch & college
		System.out.println("After sorting based on Id, Name, Branch & CollegeName");
		Collections.sort(al, Student.SORT_BY_ID_NAME_BRANCH_COLLEGENAME);
		
		for(Object s:al) {
			System.out.println((Student)s);
		}
		
	}

}
