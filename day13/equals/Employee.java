package com.training.day13.equals;

public class Employee {
	int employeeId;
	String employeeName;
	String designation;
	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if (this == obj) {
			flag = true;
		}
		if (obj instanceof Employee) {
			Employee e1 = (Employee) obj;
			if (e1.getEmployeeId() == this.getEmployeeId() 
					&& e1.getEmployeeName().equals(this.getEmployeeName())
					&& e1.getDesignation().equals(this.getDesignation())) {
				flag = true;
			}
		}
		return flag;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(" Employee Id : " + this.getEmployeeId());
		sb.append(", Employee Name : " + this.getEmployeeName());
		sb.append(", Employee Designation : " + this.getDesignation());
		sb.append(" ]");
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getEmployeeId();
	}

}
