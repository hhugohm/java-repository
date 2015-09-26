package org.neos.spring.data.jpa.test;

import java.util.List;

import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectByLike {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		
		 List<Employee> lstEmployee= dao.getEmployeeRepository().findByEmployeeWithPartOfName("H");
			lstEmployee.forEach(employee->{
				System.out.println("Employee: "+ employee.getIdEmployee() 
				+ " "+employee.getName()
				+ " "+employee.getLastName());
						});
			
		
		
		context.close();


	}

}
