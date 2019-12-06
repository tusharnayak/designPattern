package com.bridgelabz.designpattern.prototype;

public class Employee {
	private String employeeName;
	private int empId;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", empId=" + empId + "]";
	}

}
