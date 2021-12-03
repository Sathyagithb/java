package com.sample.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.rest.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
	
	List<Project> findByProjectCode(@Param("projectCode") String projectCode);

}
