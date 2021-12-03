package com.sample.rest.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_PROJ_MAPPING")
public class EmployeeMapping {
	
	@EmbeddedId
	private EmpMapID empMapId;
	
	@Column(name = "PROJ_START_DATE")
	private Date projStartDate;
	
	@Column(name = "PROJ_END_DATE")
	private Date projEndDate;
	
	@Column(name = "STATUS")
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMP_CODE", referencedColumnName="EMP_CODE", insertable = false, updatable = false)
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PROJ_ID", referencedColumnName="PROJ_ID", insertable = false, updatable = false)
	private Project projEmployee;

	public EmpMapID getEmpMapId() {
		return empMapId;
	}

	public void setEmpMapId(EmpMapID empMapId) {
		this.empMapId = empMapId;
	}
	
	public Date getProjStartDate() {
		return projStartDate;
	}

	public void setProjStartDate(Date projStartDate) {
		this.projStartDate = projStartDate;
	}

	public Date getProjEndDate() {
		return projEndDate;
	}

	public void setProjEndDate(Date projEndDate) {
		this.projEndDate = projEndDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProjEmployee() {
		return projEmployee;
	}

	public void setProjEmployee(Project projEmployee) {
		this.projEmployee = projEmployee;
	}

}
