package com.sample.rest;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.sample.rest.controller.ProjectController;
import com.sample.rest.entity.Department;
import com.sample.rest.entity.Employee;
import com.sample.rest.entity.EmployeeMapping;
import com.sample.rest.entity.Project;
import com.sample.rest.repository.EmployeeRepository;
import com.sample.rest.repository.ProjectRepository;
import com.sample.rest.schema.UpdateResponse;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
	
	@Autowired
	private MockMvc mvc;
	
	@Mock
	private ProjectRepository projectRepository;
	
	@Mock
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void whenPathVariableIsInvalidWith400() throws Exception {
		List<Project> projectList = new ArrayList<>();
		when(projectRepository.findByProjectCode(Mockito.any(String.class))).thenReturn(projectList);
		mvc.perform(get("/project/v1/employee/4556").header("Authorization", "test"))
	          .andExpect(status().isBadRequest());
	}
	
	@Test
	void whenPathVariableValidWith200() throws Exception {
		MvcResult result = mvc.perform(get("/project/v1/employee/P1000").header("Authorization", "test"))
	          .andExpect(status().isOk()).andReturn();
	}
	
	@Test
	void disAssocaiteInvalidWith400() throws Exception {
		EmployeeMapping emp = new EmployeeMapping();
		when(employeeRepository.getEmployee(Mockito.any(String.class),
				Mockito.any(String.class), Mockito.any(String.class))).thenReturn(emp);
		mvc.perform(put("/project/v1/employee/4556/3433/3432").header("Authorization", "test"))
	          .andExpect(status().isBadRequest());
	}
	
	@Test
	void alreadyDisAssocaiteValidWith400() throws Exception {
		mvc.perform(put("/project/v1/employee/D100/P1000/E1000").header("Authorization", "test"))
	          .andExpect(status().isBadRequest());
	}
	
	@Test
	void disAssocaiteValidWith200() throws Exception {
		mvc.perform(put("/project/v1/employee/D100/P1002/E1004").header("Authorization", "test"))
	          .andExpect(status().isOk());
	}

}
