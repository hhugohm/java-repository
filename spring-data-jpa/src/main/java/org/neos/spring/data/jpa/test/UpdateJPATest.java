package org.neos.spring.data.jpa.test;

import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateJPATest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		
		
		Employee employee= new Employee();
		 
		//se realiza el cambio
		employee.setIdEmployee(1);
		employee.setName("HUGO");
		employee.setLastName("HIDALGOOOOOOOOO");
		dao.getEmployeeRepository().setEmployeeInfoById(employee.getName(),employee.getLastName(),employee.getIdEmployee());
		 
		 context.close();

	}

}
