package org.neos.spring.data.jpa.test;

import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.domain.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveJPATest {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		 
		 Employee employee = new Employee("JANET","HIDALGO");
		 dao.getEmployeeRepository().save(employee);
		 
		 context.close();

	}

}
