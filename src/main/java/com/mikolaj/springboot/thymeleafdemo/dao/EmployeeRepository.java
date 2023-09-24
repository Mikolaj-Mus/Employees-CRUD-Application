package com.mikolaj.springboot.thymeleafdemo.dao;

import ch.qos.logback.core.model.conditional.ElseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mikolaj.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

    // add sort method
    public List<Employee> findALlByOrderByLastNameAsc();
	
}
