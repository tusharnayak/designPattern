package com.bridgelabz.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
public class Company implements Cloneable{
	String cname;
	List<Employee>empList=new ArrayList<>();
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", empList=" + empList + "]";
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void loadData() {
		for(int i=0;i<10;i++) {
			Employee emp= new Employee();
			emp.setEmpId(i);
			emp.setEmployeeName("name "+i);
			getEmpList().add(emp);
	}
  }
	@Override
	public Company clone() throws CloneNotSupportedException {//we are supposing this is the database data
		// TODO Auto-generated method stub
		//return super.clone();
		Company company=new Company();
		for (Employee employee : this.getEmpList()) {
			company.getEmpList().add(employee);
		}
		return company;
		
	}
	
	

}
