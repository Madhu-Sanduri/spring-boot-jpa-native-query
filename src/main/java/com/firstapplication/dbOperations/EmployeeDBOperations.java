package com.firstapplication.dbOperations;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.firstapplication.Repo.EmployeeRepo;
import com.firstapplication.enituy.EmployeeEntity;


@Component
public class EmployeeDBOperations {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void getAllEmployees() {
		List<EmployeeEntity> list=employeeRepo.getAllEmployees();
		
		
		List<EmployeeEntity> list1=list.stream()
			.filter( x -> x.getName().startsWith("A"))
			.toList();
		
		//	.forEach(System.out::println);
		
		list1.forEach(System.out::println);
	}
	
	
	public void getEmployeesByCity() {
		List<EmployeeEntity> listEmpCity= employeeRepo.getEmployeeByCity("I");
		
		listEmpCity.stream()
		.forEach(System.out::println);
	}
	
	
	public void getEmployeesByConditions() {
		List<EmployeeEntity> list2= employeeRepo.getEmployeeByGender_Age("M", 30);
		
		list2.stream()
		.sorted(Comparator.comparing(emp -> emp.getAge()))
		.forEach(System.out::println);
	}

}
