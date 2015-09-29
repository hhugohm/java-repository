package org.neos.spring.data.jpa.test;

import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteByIdTest {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				 new ClassPathXmlApplicationContext("spring-module.xml");
		
		 EmployeeDao dao = (EmployeeDao) context.getBean("registrationBean");
		 dao.getEmployeeRepository().delete(1);
		 
		 context.close();

	}

}
