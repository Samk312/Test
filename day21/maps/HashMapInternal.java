package com.training.day21.maps;

import java.util.HashMap;
import java.util.Set;

public class HashMapInternal {
	
	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		
		Address a1 = new Address();
		a1.setAddressId(1);
		a1.setCity("HYD");
		
		Address a2 = new Address();
		a2.setAddressId(2);
		a2.setCity("BLR");
		
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		System.out.println(((Integer)i).intValue());
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("emp1");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(2);
		e2.setEmployeeName("emp2");
		
		m.put(a1, a1);
		m.put(a2, a2);
		m.put(e1, e1);
		m.put(e2, e2);
		
		Set<Object> keys = m.keySet();
		
		for (Object key : keys) {
			System.out.println("Key : " + key + ", Value : " + m.get(key));
		}
	}

}
