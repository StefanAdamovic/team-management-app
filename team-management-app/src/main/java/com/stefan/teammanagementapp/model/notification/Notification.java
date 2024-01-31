package com.stefan.teammanagementapp.model.notification;

import com.stefan.teammanagementapp.model.user.User;

import java.time.Instant;

public interface Notification {

    Long getId();

    void setId(Long id);

    Instant getCreatedAt();

    void setCreatedAt(Instant createdAt);

    String getContent();

    void setContent(String content);

    User getUser();

    void setUser(User user);

    NotificationStatus getNotificationStatus();

    void setNotificationStatus(NotificationStatus notificationStatus);
}
