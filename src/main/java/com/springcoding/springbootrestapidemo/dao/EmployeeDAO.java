package com.springcoding.springbootrestapidemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcoding.springbootrestapidemo.model.Employee;
import com.springcoding.springbootrestapidemo.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/* save an employee */
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		/*passing employee object with jpa property, 
		 * spring boot will auto save the data to db*/
	}
	
	/* search all employee */
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	/* get an employee by id */
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	/* delete an employee by id */
	public void delete(Employee emplid) {
		employeeRepository.delete(emplid);
	}
	
}
