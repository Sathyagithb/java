package com.sample.rest.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sample.rest.schema.UpdateResponse;
import com.sample.rest.util.Constants;
import com.sample.rest.entity.EmployeeMapping;
import com.sample.rest.entity.Project;
import com.sample.rest.exception.GeneralException;
import com.sample.rest.repository.EmployeeRepository;
import com.sample.rest.repository.ProjectRepository;
import com.sample.rest.schema.GetProjectResponse;
import com.sample.rest.vo.ProjectVO;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);
	
	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public ProjectRepository getProjectRepository() {
		return projectRepository;
	}

	public void setProjectRepository(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public GetProjectResponse getEmployeeDetails(ProjectVO project)throws GeneralException, Exception {
		LOGGER.info("Enters into getEmployeeDetails");
		List<Project> projectList = projectRepository.findByProjectCode(project.getProjCode());
		GetProjectResponse projectResponse = new GetProjectResponse();
		ProjectMapper projectMapper = Mappers.getMapper(ProjectMapper.class);
		if(projectList != null && !projectList.isEmpty()) {
			projectResponse.getProjectDetails().addAll(projectMapper.mapProjectResponse(projectList));
		} else {
			LOGGER.info("No Project Found for the project {}", project.getProjCode());
			throw new GeneralException(Constants.BUSINESS_ERROR,
					"No Project Found for the project "+project.getProjCode());
		}
		return projectResponse;
	}

	@Override
	public UpdateResponse disAssocaiteEmployee(ProjectVO projectVO)throws GeneralException, Exception {
		LOGGER.info("Enters into disAssocaiteEmployee");
		UpdateResponse updateResponse = new UpdateResponse();
		EmployeeMapping employeeMap = employeeRepository.getEmployee(
				projectVO.getProjCode(), projectVO.getDeptCode(), projectVO.getEmpCode());
		if(employeeMap != null && employeeMap.getProjEndDate() != null) {
			if(employeeMap.getProjEndDate().after(new java.sql.Date(System.currentTimeMillis()))) {
				LOGGER.info("emplyee response {}"+employeeMap.getEmpMapId().getEmpCode());
				LocalDateTime prevDate = LocalDateTime.now().minusDays(1);
				System.out.println("Enters into disAssocaiteEmployee "+prevDate);
				employeeMap.setProjEndDate(new java.sql.Date(Timestamp.valueOf(prevDate).getTime()));
				employeeMap.setStatus("I");
				employeeRepository.save(employeeMap);
				updateResponse.setStatus(Constants.RESPONSE_SUCCESS);
			} else {
				LOGGER.info("Employee is already disassociate from the project {}"+projectVO.getProjCode());
				throw new GeneralException(Constants.BUSINESS_ERROR,
						"Employee is already disassociate from the project "+projectVO.getProjCode());
			}
		} else {
			LOGGER.info("No Employee Found for the given project"+projectVO.getProjCode());
			throw new GeneralException(Constants.BUSINESS_ERROR,
					"No Employee Found for the given project "+projectVO.getProjCode());
		}
		return updateResponse;
	}

}
