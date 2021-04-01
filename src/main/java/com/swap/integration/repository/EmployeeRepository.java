package com.swap.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swap.integration.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
