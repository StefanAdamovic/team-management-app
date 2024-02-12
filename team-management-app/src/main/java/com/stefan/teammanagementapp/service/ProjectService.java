package com.stefan.teammanagementapp.service;

import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import org.springframework.http.ResponseEntity;

public interface ProjectService {

    ProjectResponse createProject(ProjectRequest projectRequest);

    ProjectResponse getProjectById(Long projectId);

    ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest);

    ProjectResponse deleteProject(Long projectId);

    ProjectResponse assignTeamToProject(Long projectId, Long teamId);

    ProjectResponse removeTeamFromProject(Long projectId, Long teamId);

}
