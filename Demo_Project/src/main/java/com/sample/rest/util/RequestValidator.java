package com.sample.rest.util;

import org.springframework.util.StringUtils;

import com.sample.rest.exception.GeneralException;
import com.sample.rest.vo.ProjectVO;

public class RequestValidator {
	
	public static boolean validateProjectCode(
			String projectCode) throws GeneralException {
		if(!StringUtils.hasText(projectCode)) {
			throw new GeneralException("MANDATORY_ERROR", "Project Code is mandatory");
		}
		return true;
	}
	
	public static boolean validateProject(ProjectVO project) throws GeneralException {
		if(!(StringUtils.hasText(project.getProjCode()) 
				&&  StringUtils.hasText(project.getDeptCode())
				&& StringUtils.hasText(project.getEmpCode()))) {
			throw new GeneralException("MANDATORY_ERROR", "Project Code / Depart Code / Employee Code are Mandatory");
		}
		return true;
	}

}
