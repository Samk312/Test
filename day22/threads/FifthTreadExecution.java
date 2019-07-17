package com.trainining.day22.threads;

public class FifthTreadExecution {
	
	public void m1() {
		for (int i=0; i<1000;i++) {
			System.out.println(" m1 () : " + i);
		}
	}
	public void m2() {
		for (int i=0; i<1000;i++) {
			System.out.println(" m2 () : " + i);
		}
	}
	public void m3() {
		for (int i=0; i<1000;i++) {
			System.out.println(" m3 () : " + i);
		}
	}
	public void m4() {
		for (int i=0; i<1000;i++) {
			System.out.println(" m4 () : " + i);
		}
	}
	public void m5() {
		for (int i=0; i<1000;i++) {
			System.out.println(" m5 () : " + i);
		}
	}
//	public void m6() {
//		for (int i=0; i<1000;i++) {
//			System.out.println(" m6 () : " + i);
//		}
//	}
//	public void m7() {
//		for (int i=0; i<1000;i++) {
//			System.out.println(" m7 () : " + i);
//		}
//	}
//	public void m8() {
//		for (int i=0; i<1000;i++) {
//			System.out.println(" m8 () : " + i);
//		}
//	}
//	public void m9() {
//		for (int i=0; i<1000;i++) {
//			System.out.println(" m9 () : " + i);
//		}
//	}
//
//	public void m10() {
//		for (int i=0; i<1000;i++) {
//			System.out.println(" m10 () : " + i);
//		}
//	}
	
	
	public static void main(String[] args) {
		
		FifthTreadExecution f = new FifthTreadExecution();
		System.out.println("Starting Time : " + System.nanoTime());//1464835933348153000
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		f.m5();
//		f.m6();
//		f.m7();
//		f.m8();
//		f.m9();
//		f.m10();
		System.out.println("Ending Time : " + System.nanoTime());//1464835933538769000
		//19,06,16,000
		//diff : 
	}
}
