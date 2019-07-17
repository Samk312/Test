package com.training.day20.compare;

import java.util.Comparator;

public class Student {
	
	private int studentNo;
	private String studentName;
	private String branchName;
	private String collegeName;
	
	public Student() {
	}
	
	public Student(int studentNo, String studentName, String branchName, String collegeName) {
		this.studentName = studentName;
		this.studentNo = studentNo;
		this.branchName = branchName;
		this.collegeName = collegeName;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
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
		sb.append(", Branch Name :" + this.getBranchName());
		sb.append(", College Name :" + this.getCollegeName());
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
				&& std.studentNo == this.studentNo
				&& std.branchName.equals(this.branchName) 
				&& std.collegeName.equals(this.collegeName)) {
			flag = true;
		}
		return flag;
	}
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return this.getStudentNo();
//	}
//	
	
	public static final Comparator<Student> SORT_BY_ID = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			int studentIdDiff = Integer.toString(o1.getStudentNo()).compareTo(Integer.toString(o2.getStudentNo()));
			return studentIdDiff;
		}
	};
	
	public static final Comparator<Student> SORT_BY_ID_NAME = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			int studentIdDiff = Integer.toString(o1.getStudentNo()).compareTo(Integer.toString(o2.getStudentNo()));
			int studentName = o1.getStudentName().compareTo(o2.getStudentName());
			return studentIdDiff == 0 ? studentName : studentIdDiff;
		}
	};
	
	public static final Comparator<Student> SORT_BY_ID_NAME_BRANCH = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			int studentIdDiff = Integer.toString(o1.getStudentNo()).compareTo(Integer.toString(o2.getStudentNo()));
			int studentNameDiff = o1.getStudentName().compareTo(o2.getStudentName());
			int branchNameDiff = o1.getBranchName().compareTo(o2.getBranchName());
			return (studentIdDiff == 0 ? (studentNameDiff == 0 ? branchNameDiff : studentNameDiff) : studentIdDiff);
		}
	};
	
	public static final Comparator<Student> SORT_BY_ID_NAME_BRANCH_COLLEGENAME = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			int studentIdDiff = Integer.toString(o1.getStudentNo()).compareTo(Integer.toString(o2.getStudentNo()));
			int studentNameDiff = o1.getStudentName().compareTo(o2.getStudentName());
			int branchNameDiff = o1.getBranchName().compareTo(o2.getBranchName());
			int collegeNameDiff = o1.getCollegeName().compareTo(o2.getCollegeName());
			return (studentIdDiff == 0 ? (studentNameDiff == 0 ? (branchNameDiff == 0 ? collegeNameDiff : branchNameDiff) : studentNameDiff) : studentIdDiff);
		}
	};
	
}

