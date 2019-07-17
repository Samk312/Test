package com.training.day6.inheritance;

public class InheritenceVehicleTest {
	
	public static void main(String[] args) {
		OneFather f = new OneFather();
		System.out.println(f.getFatherVehicle());
		System.out.println("*******************");
		
		TwoSon s = new TwoSon();
		System.out.println(s.getFatherVehicle());
		System.out.println(s.getSonVehicle());
		System.out.println("*******************");
		
		ThreeKid k = new ThreeKid();
		System.out.println(k.getFatherVehicle());
		System.out.println(k.getSonVehicle());
		System.out.println(k.getKidVehicle());
	}

}
