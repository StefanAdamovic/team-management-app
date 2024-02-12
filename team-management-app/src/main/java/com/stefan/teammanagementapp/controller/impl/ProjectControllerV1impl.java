package com.stefan.teammanagementapp.controller.impl;

import com.stefan.teammanagementapp.controller.ProjectController;
import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import com.stefan.teammanagementapp.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO Complete project controller

//TODO complete mappings for project controller
@RestController
@RequestMapping("/projects")
public class ProjectControllerV1impl implements ProjectController {

    ProjectService projectService;


    @Autowired
    public ProjectControllerV1impl(ProjectService projectService) {
        this.projectService = projectService;
    }


    @Operation(summary = "Create project")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public ResponseEntity<ProjectResponse> createProject(ProjectRequest projectRequest) {
        return new ResponseEntity<>(projectService.createProject(projectRequest), HttpStatus.CREATED);
    }


    @Operation(summary = "Get all projects")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<List<ProjectResponse>> getAllProjects() {
        return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
    }


    @Operation(summary = "Get project by ID")
    @GetMapping(value = "/{projectId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long projectId) {
        return new ResponseEntity<>(projectService.getProjectById(projectId), HttpStatus.OK);
    }


    @Operation(summary = "Update project by ID")
    @PutMapping(value = "/{projectId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<ProjectResponse> updateProject(Long projectId, ProjectRequest projectRequest) {
        return new ResponseEntity<>(projectService.updateProject(projectId, projectRequest), HttpStatus.OK);
    }


    @Operation(summary = "Delete project by ID")
    @DeleteMapping(value = "/{projectId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<ProjectResponse> deleteProject(Long projectId) {
        return new ResponseEntity<>(projectService.deleteProject(projectId), HttpStatus.OK);
    }


    @Operation(summary = "Assign team to project")
    @PostMapping(value = "/{projectId}/assignTeam/{teamId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<ProjectResponse> assignTeamToProject(Long projectId, Long teamId) {
        return new ResponseEntity<>(projectService.assignTeamToProject(projectId, teamId), HttpStatus.OK);
    }


    @Operation(summary = "Remove team from project")
    @DeleteMapping(value = "/{projectId}/removeTeam/{teamId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public ResponseEntity<ProjectResponse> removeTeamFromProject(Long projectId, Long teamId) {
        return new ResponseEntity<>(projectService.removeTeamFromProject(projectId, teamId), HttpStatus.OK);
    }
}
