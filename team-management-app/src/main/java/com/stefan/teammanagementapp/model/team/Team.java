package com.stefan.teammanagementapp.model.team;

import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
import com.stefan.teammanagementapp.model.user.impl.UserImpl;

import java.util.List;

public interface Team {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    UserImpl getTeamLead();

    void setTeamLead(UserImpl teamLead);

    List<UserImpl> getTeamMembers();

    void setTeamMembers(List<UserImpl> teamMembers);

    List<ProjectImpl> getProjects();

    void setProjects(List<ProjectImpl> projects);
}
