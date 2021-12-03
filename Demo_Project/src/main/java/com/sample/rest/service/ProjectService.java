package com.sample.rest.service;

import com.sample.rest.exception.GeneralException;
import com.sample.rest.schema.GetProjectResponse;
import com.sample.rest.schema.UpdateResponse;
import com.sample.rest.vo.ProjectVO;

public interface ProjectService {
	
	GetProjectResponse getEmployeeDetails(ProjectVO project)throws GeneralException, Exception;
	
	UpdateResponse disAssocaiteEmployee(ProjectVO project)throws GeneralException, Exception;

}
