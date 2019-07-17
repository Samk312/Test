package com.trainining.day22.threads;

public class SixthThreadExample extends Thread{
	
		public void run() {
			
			if (Thread.currentThread().getName().equals("first")) {
				m1();
			}
			
			if (Thread.currentThread().getName().equals("second")) {
				m2();
			}
			
			if (Thread.currentThread().getName().equals("third")) {
				m3();
			}
			
			if (Thread.currentThread().getName().equals("fourth")) {
				m4();
			}
			
			if (Thread.currentThread().getName().equals("five")) {
				m5();
			}
			
//			if (Thread.currentThread().getName().equals("six")) {
//				m6();
//			}
//			
//			if (Thread.currentThread().getName().equals("seven")) {
//				m7();
//			}
//			
//			if (Thread.currentThread().getName().equals("eight")) {
//				m8();
//			}
//			
//			if (Thread.currentThread().getName().equals("nine")) {
//				m9();
//			}
//			
//			if (Thread.currentThread().getName().equals("ten")) {
//				m10();
//			}
		}

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
//		public void m6() {
//			for (int i=0; i<1000;i++) {
//				System.out.println(" m6 () : " + i);
//			}
//		}
//		public void m7() {
//			for (int i=0; i<1000;i++) {
//				System.out.println(" m7 () : " + i);
//			}
//		}
//		public void m8() {
//			for (int i=0; i<1000;i++) {
//				System.out.println(" m8 () : " + i);
//			}
//		}
//		public void m9() {
//			for (int i=0; i<1000;i++) {
//				System.out.println(" m9 () : " + i);
//			}
//		}
//
//		public void m10() {
//			for (int i=0; i<1000;i++) {
//				System.out.println(" m10 () : " + i);
//			}
//		}
		
		public static void main(String[] args) {
			System.out.println("Starting Time : " + System.nanoTime());
			SixthThreadExample s1 = new SixthThreadExample();
			s1.setName("first");
			s1.start();
			
			SixthThreadExample s2 = new SixthThreadExample();
			s2.setName("second");
			s2.start();
			
			SixthThreadExample s3 = new SixthThreadExample();
			s3.setName("third");
			s3.start();
			
			SixthThreadExample s4 = new SixthThreadExample();
			s4.setName("fourth");
			s4.start();
			
			SixthThreadExample s5 = new SixthThreadExample();
			s5.setName("five");
			s5.start();
			
//			SixthThreadExample s6 = new SixthThreadExample();
//			s6.setName("six");
//			s6.start();
//			
//			SixthThreadExample s7 = new SixthThreadExample();
//			s7.setName("seven");
//			s7.start();
//			
//			SixthThreadExample s8 = new SixthThreadExample();
//			s8.setName("eight");
//			s8.start();
//			
//			SixthThreadExample s9 = new SixthThreadExample();
//			s9.setName("nine");
//			s9.start();
//			
//			SixthThreadExample s10 = new SixthThreadExample();
//			s10.setName("ten");
//			s10.start();
			System.out.println("Ending Time : " + System.nanoTime());
		}
}
