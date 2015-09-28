package org.neos.spring.data.unit.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neos.spring.data.jpa.dao.EmployeeDao;
import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-module-test.xml"})
public class SelectListTest {
	
	@Autowired
	//@Qualifier("registrationBean")
	private EmployeeDao employeeDao;
	

	@Before
	 public void setUp() throws Exception {
	 }
	 @After
	  public void tearDown() throws Exception {
	  }
	
	 @Test
	 public void TestListEmployees(){
		
			List<Employee> lstEmployee= employeeDao.getEmployeeRepository().findAll();
			 assertEquals(3, lstEmployee.size());
			lstEmployee.forEach(employee->{
				System.out.println("Employee: "+ employee.getIdEmployee() 
				+ " "+employee.getName()
				+ " "+employee.getLastName());
						});
		 
	 }
}
