package com.sample.rest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.rest.entity.EmployeeMapping;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeMapping, String> {
	
	@Query(value = "select empMap from EmployeeMapping empMap, Employee emp, Project proj, Department dept "
			+ "where emp.empCode = :empCode and proj.projectCode = :projectCode and dept.deptCode = :deptCode "
			+ "and empMap.employee = emp and empMap.projEmployee = proj and proj.department = dept")
	EmployeeMapping getEmployee(@Param("projectCode") String projectCode, @Param("deptCode") String deptCode, @Param("empCode") String empCode);
	
}
