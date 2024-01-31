package com.stefan.teammanagementapp.model.team;

import com.stefan.teammanagementapp.model.user.User;

import java.util.List;

public interface Team {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    User getTeamLead();

    void setTeamLead(User teamLead);

    List<User> getTeamMembers();

    void setTeamMembers(List<User> teamMembers);
}
