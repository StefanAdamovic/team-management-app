package com.stefan.teammanagementapp.model.preference;

import com.stefan.teammanagementapp.model.user.impl.UserImpl;

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

    UserImpl getUser();

    void setUser(UserImpl user);

}
