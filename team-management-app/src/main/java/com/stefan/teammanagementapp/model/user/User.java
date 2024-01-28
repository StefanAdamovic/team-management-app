package com.stefan.teammanagementapp.model.user;

import com.stefan.teammanagementapp.model.preference.Preference;
import com.stefan.teammanagementapp.model.user.role.UserRole;

public interface User {

    Long getId();

    void setId(Long id);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getEmail();

    void setEmail(String email);

    UserRole getUserRole();

    void setUserRole(UserRole userRole);

    String getPassword();

    void setPassword();

    byte[] getProfileImage();

    void setProfileImage(byte[] profileImage);

}
