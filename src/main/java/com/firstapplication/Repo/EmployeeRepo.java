package com.firstapplication.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.firstapplication.enituy.EmployeeEntity;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
	
	
	@Query(value="select * from employees_data",nativeQuery = true)
	List<EmployeeEntity> getAllEmployees();
	
	
	@Query(value="select * from employees_data ed where ed.country like ?1% " ,nativeQuery = true)
	List<EmployeeEntity> getEmployeeByCity(String city);
	
}
