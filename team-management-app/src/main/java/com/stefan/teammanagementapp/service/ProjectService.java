package com.stefan.teammanagementapp.service;

import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;

import java.util.List;

public interface ProjectService {

    ProjectResponse createProject(ProjectRequest projectRequest);

    public List<ProjectResponse> getAllProjects();

    ProjectResponse getProjectById(Long projectId);

    ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest);

    ProjectResponse deleteProject(Long projectId);

    ProjectResponse assignTeamToProject(Long projectId, Long teamId);

    ProjectResponse removeTeamFromProject(Long projectId, Long teamId);

}
