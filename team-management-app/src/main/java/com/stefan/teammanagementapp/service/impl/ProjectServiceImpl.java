package com.stefan.teammanagementapp.service.impl;

import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
import com.stefan.teammanagementapp.model.project.impl.ProjectRequest;
import com.stefan.teammanagementapp.model.project.impl.ProjectResponse;
import com.stefan.teammanagementapp.repository.ProjectRepository;
import com.stefan.teammanagementapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    //TODO complete project service
    ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    //TODO complete service create project
    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest) {
        return new ProjectResponse(projectRepository.save(new ProjectImpl(projectRequest)));
    }

    //TODO complete service get all projects
    @Override
    public List<ProjectResponse> getAllProjects() {
        return null;
    }

    //TODO complete service get project by id
    @Override
    public ProjectResponse getProjectById(Long projectId) {
        return null;
    }

    //TODO complete service update project
    @Override
    public ProjectResponse updateProject(Long projectId, ProjectRequest projectRequest) {
        return null;
    }

    //TODO complete service delete project
    @Override
    public ProjectResponse deleteProject(Long projectId) {
        return null;
    }

    //TODO complete service assign team to project
    @Override
    public ProjectResponse assignTeamToProject(Long projectId, Long teamId) {
        return null;
    }


    //TODO complete service remove team from project
    @Override
    public ProjectResponse removeTeamFromProject(Long projectId, Long teamId) {
        return null;
    }
}
