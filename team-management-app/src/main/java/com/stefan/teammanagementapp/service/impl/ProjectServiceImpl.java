package com.stefan.teammanagementapp.service.impl;

import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import com.stefan.teammanagementapp.repository.ProjectRepository;
import com.stefan.teammanagementapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest) {
        return null;
    }

    @Override
    public List<ProjectResponse> getAllProjects() {
        return null;
    }

    @Override
    public ProjectResponse getProjectById(Long projectId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest) {
        return null;
    }

    @Override
    public ProjectResponse deleteProject(Long projectId) {
        return null;
    }

    @Override
    public ProjectResponse assignTeamToProject(Long projectId, Long teamId) {
        return null;
    }

    @Override
    public ProjectResponse removeTeamFromProject(Long projectId, Long teamId) {
        return null;
    }
}
