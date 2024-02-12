package com.stefan.teammanagementapp.repository;

import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectImpl, Long> {
}
