package com.stefan.teammanagementapp.controller.impl;

import com.stefan.teammanagementapp.controller.ProjectController;
import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//TODO mapiranja da li da budu

// Za project kontroler
// api/v1/projects/{projectId}

// Za team kontroler
// api/v1/projects/{projectId}/teams/{teamId}

// Za task kontroler
// api/v1/projects/{projectId}/teams/{teamId}/tasks/{taskId}

//TODO Complete project controller

//TODO complete mappings for project controller
@RestController
public class ProjectControllerV1impl implements ProjectController {


    ProjectService projectService;

    @Autowired
    public ProjectControllerV1impl(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public ResponseEntity<ProjectResponse> createProject(ProjectRequest projectRequest) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectResponse> getProjectById(Long projectId) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectResponse> updateProject(Long projectId, ProjectRequest projectRequest) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectResponse> deleteProject(Long projectId) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectResponse> assignTeamToProject(Long projectId, Long teamId) {
        return null;
    }

    @Override
    public ResponseEntity<ProjectResponse> removeTeamFromProject(Long projectId, Long teamId) {
        return null;
    }
}
