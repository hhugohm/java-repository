package neos.org.spring.boot.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Hector Hugo Midalgo
 * 27/09/2015
 * This clase has a mapping for EMPLOYEES table in RH schema
 *
 */
@Entity
@Table(name="EMPLOYEES")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_EMPLOYEE")
	private Integer idEmployee;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	public Employee(){}
	
	public Employee (String name,String lastName){
		this.name=name;
		this.lastName=lastName;
	}
	
	
	public Integer getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
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
