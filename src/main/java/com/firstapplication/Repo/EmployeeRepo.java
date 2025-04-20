package com.firstapplication.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.firstapplication.enituy.EmployeeEntity;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
	
	
	@Query(value="select * from employees_data",nativeQuery = true)
	List<EmployeeEntity> getAllEmployees();
	
	
	@Query(value="select * from employees_data ed where ed.country like ?1% " ,nativeQuery = true)
	List<EmployeeEntity> getEmployeeByCity(String city);
	
	@Query(value="select * from employees_data ed where ed.gender like ?1 and ed.age> ?2", nativeQuery = true)
	List<EmployeeEntity> getEmployeeByGender_Age(String gender, int age);
	
	
	@Query(value="select * from employees_data ed where name LIKE %:name% and country = :country and age =:age", nativeQuery = true )
	List<EmployeeEntity> getEmployeeInNamedFormat(@Param("name")String name,@Param("country")String country,@Param("age") int age);
	
}
