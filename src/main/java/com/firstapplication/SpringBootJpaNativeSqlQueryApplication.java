package com.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstapplication.dbOperations.EmployeeDBOperations;

@SpringBootApplication
public class SpringBootJpaNativeSqlQueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringBootJpaNativeSqlQueryApplication.class, args);
		
		EmployeeDBOperations demo= container.getBean(EmployeeDBOperations.class);
		//demo.addEmployees();
		demo.getAllEmployees();
		
		demo.getEmployeesByCity();
		
		demo.getEmployeesByConditions();
		
		demo.getEmployeesNameParameters();
		
	}

}
