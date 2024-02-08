package com.stefan.teammanagementapp.controller;

import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import org.springframework.http.ResponseEntity;

public interface ProjectController {

    ResponseEntity<ProjectResponse> createProject(ProjectRequest projectRequest);

    ResponseEntity<ProjectResponse> getProjectById(Long projectId);

    ResponseEntity<ProjectResponse> updateProject(Long projectId, ProjectRequest projectRequest);

    ResponseEntity<ProjectResponse> deleteProject(Long projectId);

    ResponseEntity<ProjectResponse> assignTeamToProject(Long projectId, Long teamId);

    ResponseEntity<ProjectResponse> removeTeamFromProject(Long projectId, Long teamId);

}
