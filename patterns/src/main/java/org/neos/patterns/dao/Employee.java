package org.neos.patterns.dao;

public class Employee {
	
	

	private int id_employee;
	private String name;
	private String last_name;
	
	
	public Employee(int id_employee,String name,String last_name){
		this.id_employee=id_employee;
		this.name=name;
		this.last_name=last_name;
		
	}
	
	public int getId_employee() {
		return id_employee;
	}
	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
		
}
