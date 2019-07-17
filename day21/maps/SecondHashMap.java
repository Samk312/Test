package com.training.day21.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SecondHashMap {

	public static void main(String[] args) {
		
		Student s3= new Student(2,"Uttej");
		Student s4= new Student(3,"Arshith");
		Student s5= new Student(1,"Kalyan");
		Student s6= new Student(4,"Varun");
		Student s7= new Student(3,"Arshith");
		Student s8= new Student(2,"Uttej");
		Student s9= new Student(5,"Varun");
		Student s10= new Student(1,"Kalyan");
		Student s1= new Student(1,"Kalyan");
		Student s2= new Student(1,"Kalyan");
		
		HashMap map1 = new HashMap();
		map1.put(2, s3);
		map1.put(3, s4);
		map1.put(1, s5);
		map1.put(4, s6);
		map1.put(3, s7);
		map1.put(2, s8);
		map1.put(4, s9);
		map1.put(1, s10);
		map1.put(1, s1);
		map1.put(1, s1);
		
		//System.out.println(map1);
		
		HashMap lmap = new HashMap();
		lmap.put(s3, s3);
		lmap.put(s6, s6);
		lmap.put(s9, s9);
		lmap.put(s8, s8);
		
		for (Object o : lmap.keySet()) {
			Student s = (Student)o;
			
			System.out.println("s.getStudentNo()" + s.getStudentNo() + "s.hashCode()"  +s.hashCode());
		}
		//System.out.println(lmap);
		System.out.println(lmap.size());
		

	}

}
