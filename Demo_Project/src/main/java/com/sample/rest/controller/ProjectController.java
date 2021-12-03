package com.sample.rest.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.rest.exception.GeneralException;
import com.sample.rest.schema.GetProjectResponse;
import com.sample.rest.schema.UpdateResponse;
import com.sample.rest.service.ProjectService;
import com.sample.rest.util.RequestValidator;
import com.sample.rest.vo.ProjectVO;

@RequestMapping(value = "/project/v1/")
@RestController
@Validated
public class ProjectController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping(value = "employee/{projectCode}")
	public ResponseEntity<GetProjectResponse> getEmployeeDetails(
			@RequestHeader("Authorization") String authorization,
			@NotBlank @Valid @PathVariable(required = true) String projectCode) throws GeneralException, Exception {
		boolean validate = RequestValidator.validateProjectCode(projectCode);
		LOGGER.info("getEmployeeDetails - validate {}", validate);
		ProjectVO project = new ProjectVO();
		project.setProjCode(projectCode);
		GetProjectResponse projectResponse = projectService.getEmployeeDetails(project);
		return ResponseEntity.ok(projectResponse);
	}
	
	@PutMapping(value = "employee/{departmentCode}/{projectCode}/{employeeCode}")
	public ResponseEntity<UpdateResponse> disassociateEmployee(@RequestHeader("Authorization") String authorization,
			@PathVariable(required = true) String departmentCode, @PathVariable(required = true) String projectCode,
			@PathVariable(required = true) String employeeCode) throws GeneralException, Exception {
		ProjectVO project = new ProjectVO();
		project.setDeptCode(departmentCode);
		project.setProjCode(projectCode);
		project.setEmpCode(employeeCode);
		RequestValidator.validateProject(project);
		UpdateResponse response = projectService.disAssocaiteEmployee(project);
		return ResponseEntity.ok(response);
	}

}
