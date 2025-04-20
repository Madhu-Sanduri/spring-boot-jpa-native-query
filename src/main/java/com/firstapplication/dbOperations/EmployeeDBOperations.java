package com.firstapplication.dbOperations;

import java.util.ArrayList;
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
	
	
	public void addEmployees() {
		List<EmployeeEntity> list = new ArrayList<>(List.of(
				new EmployeeEntity(116,"Madhu Sanduri","24","Guntur",'M',"India"),
				new EmployeeEntity(117,"Prasad Reddy","26","Vizag",'M',"India"),
				new EmployeeEntity(118, "Madhu Reddy", "24", "Guntur", 'M', "India"),
				new EmployeeEntity(119, "Madhu Kumar", "27", "Guntur", 'M', "India"),
				new EmployeeEntity(120, "Madhu Sanduri", "24", "Hyderabad", 'M', "India"),
				new EmployeeEntity(121, "Madhu Verma", "34", "Delhi", 'M', "India"),

				


				new EmployeeEntity(125, "Alice Brown", "29", "Los Angeles", 'F', "USA"),
				new EmployeeEntity(126, "Alice Johnson", "29", "Paris", 'F', "France"),

				new EmployeeEntity(127, "Bob Smith", "35", "Manchester", 'M', "UK"),
				new EmployeeEntity(128, "Bob Smith", "35", "Dublin", 'M', "Ireland"),


				new EmployeeEntity(129, "Carlos Mendez", "42", "Madrid", 'F', "Spain"),


				new EmployeeEntity(130, "George Kim", "45", "Busan", 'M', "South Korea"),
				new EmployeeEntity(131, "George Kim", "45", "Los Angeles", 'M', "USA")));
		
		
		employeeRepo.saveAll(list);
				/*
				 * this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.country = country;
				 * */
	}
	
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
	
	
	public void getEmployeesNameParameters() {
		List<EmployeeEntity> list3 = employeeRepo.getEmployeeInNamedFormat("Alice","USA",29);
		
		list3.stream()
		.forEach(System.out::println);
	}

}
