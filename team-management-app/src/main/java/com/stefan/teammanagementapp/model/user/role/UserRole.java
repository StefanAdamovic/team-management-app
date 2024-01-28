package com.stefan.teammanagementapp.model.user.role;

public interface UserRole {

    Long getId();

    void setId(Long id);

    UserRoleName getName();

    void setName(UserRoleName name);

    String getDescription();

    void setDescription(String description);

}
