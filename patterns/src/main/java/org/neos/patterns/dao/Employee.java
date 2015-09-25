package org.neos.patterns.dao;

public class Employee {
	
	private int idEmployee;
	private String name;
	private String lastName;
	
	public Employee(){}
	
	public Employee(int idEmployee,String name,String lastName){
		this.idEmployee=idEmployee;
		this.name=name;
		this.lastName=lastName;
		
	}


	public int getIdEmployee() {
		return idEmployee;
	}


	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
		
}
