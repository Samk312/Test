package com.training.day17.collections;

import java.util.Enumeration;
import java.util.Vector;

public class SixthVector {
	
	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add("varun");
		v.addElement("Kumar");
		v.addElement("Reddy");
		v.add(2, "Palvai");
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
