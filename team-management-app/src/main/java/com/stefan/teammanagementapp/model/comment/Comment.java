package com.stefan.teammanagementapp.model.comment;

import com.stefan.teammanagementapp.model.user.User;

import java.time.Instant;

public interface Comment {

    Long getId();

    void setId(Long id);

    String getContent();

    void setContent(String content);

    User getAuthor();

    void setAuthor(User author);

    Instant getCreatedAt();

    void setCreatedAt(Instant createdAt);

    //TODO association with project or task? I am able to comment on project, but also on each task.
    // Should I extend ProjectComment and TaskComment?

}
