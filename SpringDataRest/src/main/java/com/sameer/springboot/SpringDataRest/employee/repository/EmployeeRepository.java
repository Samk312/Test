package com.sameer.springboot.SpringDataRest.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.sameer.springboot.SpringDataRest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
