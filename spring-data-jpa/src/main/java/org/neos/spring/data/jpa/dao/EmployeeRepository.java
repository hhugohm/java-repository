package org.neos.spring.data.jpa.dao;

import java.util.List;

import org.neos.spring.data.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Integer>{

	public Employee findByidEmployee(Integer id);
	
	@Query("SELECT e FROM Employee e WHERE e.name = ?")
	public List<Employee> findByname(String name);
	
	
	@Query("SELECT e FROM Employee e WHERE e.name  LIKE CONCAT('%',:name,'%') ORDER BY e.name")
	public List<Employee> findByEmployeeWithPartOfName(@Param("name") String name);
	

}
