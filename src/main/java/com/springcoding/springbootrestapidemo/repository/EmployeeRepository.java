package com.springcoding.springbootrestapidemo.repository;

import com.springcoding.springbootrestapidemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}


