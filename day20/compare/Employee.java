package com.training.day20.compare;

public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(" Employee Id : " + this.getEmployeeId());
		sb.append(", Employee Name : " + this.getEmployeeName());
		sb.append(", Salary : " + this.getSalary());
		sb.append(" ]");
		return sb.toString();
	}
	
	// compareTo based on employee Id in ascending order
	/*
	@Override
	public int compareTo(Employee employee) {
		
		if (this.getEmployeeId() > employee.getEmployeeId()) {
			return 1;
		} else if (this.getEmployeeId() < employee.getEmployeeId()) {
			return -1;
		} else {
			return 0;
		}
	}
	*/
	
	// compareTo based on employee Id in descending order -- just observe the retun values with above axcending
	/*	
	@Override
		public int compareTo(Employee employee) {
			
			if (this.getEmployeeId() > employee.getEmployeeId()) {
				return -1;
			} else if (this.getEmployeeId() < employee.getEmployeeId()) {
				return 1;
			} else {
				return 0;
			}
		}
	*/
	
	// compareTo based on employee Name in ascending order
			/*	
			@Override
				public int compareTo(Employee employee) {
					return this.getEmployeeName().compareTo(employee.getEmployeeName());
				}
				
				*/
				// compareTo based on employee Name in ascending order
				@Override
				public int compareTo(Employee employee) {
					return employee.getEmployeeName().compareTo(this.getEmployeeName());
				}



}
