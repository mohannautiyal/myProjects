package com.home.entities;


public class employee {
	
	private String name;
	private int empId;
	private String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public employee(String name, int empId, String department) {
		super();
		this.name = name;
		this.empId = empId;
		this.department = department;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", empId=" + empId + ", department=" + department + "]";
	}
	
	
	

}
