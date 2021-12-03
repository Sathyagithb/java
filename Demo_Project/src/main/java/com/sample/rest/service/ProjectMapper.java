package com.sample.rest.service;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.sample.rest.entity.EmployeeMapping;
import com.sample.rest.entity.Project;
import com.sample.rest.schema.EmployeeDetail;
import com.sample.rest.schema.ProjectDetail;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
	
	List<ProjectDetail> mapProjectResponse(List<Project> project);
	
	@Mappings({
	      @Mapping(target="startDate", source="project.startDate",
	    		  dateFormat = "dd-MM-yyyy"),
	      @Mapping(target="endDate", source="project.endDate",
	      			dateFormat = "dd-MM-yyyy"),
	      @Mapping(target="deptCode", source="project.department.deptCode"),
	      @Mapping(target="deptName", source="project.department.deptName")
	    })
	ProjectDetail mapProjectDetail(Project project);
	
	List<EmployeeDetail> mapEmployeeResponse(List<EmployeeMapping> project);
	
	@Mappings({
		  @Mapping(target="empCode", source="emp.employee.empCode"),
		  @Mapping(target="empName", source="emp.employee.empName"),
		  @Mapping(target="empContact", source="emp.employee.empContact"),
		  @Mapping(target="designation", source="emp.employee.designation"),
	      @Mapping(target="empProjStartDate", source="emp.projStartDate",
	      			dateFormat = "dd-MM-yyyy"),
	      @Mapping(target="empProjEndDate", source="emp.projEndDate",
	      			dateFormat = "dd-MM-yyyy")
	    })
	EmployeeDetail mapEmployeeDetail(EmployeeMapping emp);
}
