package com.stefan.teammanagementapp.model.preference;

import com.stefan.teammanagementapp.model.user.User;

public interface Preference {

    Long getId();

    void setId(Long id);

    boolean getEmailNotification();

    void setEmailNotification(boolean emailNotification);

    boolean getAppNotification();

    void setAppNotification(boolean appNotification);

    Theme getTheme();

    void setTheme(Theme theme);

    Language getLanguage();

    void setLanguage(Language language);

    User getUser();

    void setUser(User user);

    //TODO do i need user relationship?
}
