package com.stefan.teammanagementapp.model.user;

import com.stefan.teammanagementapp.model.user.impl.UserRoleImpl;

public interface User {

    Long getId();

    void setId(Long id);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getEmail();

    void setEmail(String email);

    UserRoleImpl getUserRole();

    void setUserRole(UserRoleImpl userRole);

    String getPassword();

    void setPassword(String password);

    byte[] getProfileImage();

    void setProfileImage(byte[] profileImage);

}
