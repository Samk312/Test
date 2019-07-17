package com.training.day19.set;

public class Student implements Comparable<Student> {
	
	private int studentNo;
	private String studentName;
	
	public Student() {
	}
	
	public Student(int studentNo, String studentName) {
		this.studentName = studentName;
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[Student No :" + this.getStudentNo());
		sb.append(", Student Name :" + this.getStudentName());
		sb.append("]");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (this == obj) {
			flag =  true;
		} 
		Student std = (Student) obj;
		if (std.studentName.equals(this.studentName) 
				&& std.studentNo == this.studentNo) {
			flag = true;
		}
		return flag;
	} 
	
//	@Override
//	public int compareTo(Student o) {
//		int a = 0;
//		if (o.studentName.equals(this.studentName) 
//				&& o.studentNo == this.studentNo) {
//			a = 1;
//		}
//		return a;
//	}
	
	@Override
	public int compareTo(Student o) {
		return this.getStudentNo();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getStudentNo();
	}
	

}
