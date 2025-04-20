package com.firstapplication.enituy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Component
@Repository
@Entity
@Table(name="EmployeesData")
public class EmployeeEntity {
	
	
	@Id
	private int employeeId;
	
	private String name;
	
	private String age;
	
	private String city;
	
	private char gender;
	
	private String country;
	
	

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int employeeId, String name, String age, String city, char gender, String country) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
		this.country = country;
	}
	
	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public char getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", age=" + age + ", city= " + city+ 
				", country= " + country + ", gender= " + gender + ", name= "+ name+"]";
	}
}
	
	

//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	@Override
//	public String toString() {
//		return "EmployeeEntity [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", city=" + city
//				+ ", gender=" + gender + ", country=" + country + "]";
//	}
//	
	

//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
	
	
//}
