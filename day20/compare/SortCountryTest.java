package com.training.day20.compare;

import java.util.ArrayList;
import java.util.Collections;

public class SortCountryTest {
	
	public static void main(String[] args) {
		
		Country c1 = new Country("India", "Delhi");
		Country c2 = new Country("Pakistan", "Lahore");
		Country c3 = new Country("Srilanka", "Colomno");
		Country c4 = new Country("Bangladesh", "Dhaka");
		Country c5 = new Country("Australia", "Sydney");
		
		ArrayList al = new ArrayList<>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		
		System.out.println("Before Sorting");
		
		for (Object c : al) {
			System.out.println((Country)c);
		}
		
		
		// 1. With out implementing comparable interface
		/*System.out.println("After Sorting");
		Collections.sort(al);
		
		// Note : Since we have not implemented comparable interface in Country class, it will throw error
		
		for (Object c : al) {
			System.out.println((Country)c);
		}
		*/
		
		// 2. Sorting based on country name using COUNTRYNAME_COMPARATOR
		/*System.out.println("After Sorting Based on country name");
		Collections.sort(al, Country.COUNTRYNAME_COMPARATOR);
		
		// Note : Since we have not implemented comparable interface in Country class, it will throw error
		
		for (Object c : al) {
			System.out.println((Country)c);
		}
		*/
		
		System.out.println("After Sorting Based on capital name");
		Collections.sort(al, Country.CAPITALNAME_COMPARATOR);
		
		// Note : Since we have not implemented comparable interface in Country class, it will throw error
		
		for (Object c : al) {
			System.out.println((Country)c);
		}
		
		
	}

}
