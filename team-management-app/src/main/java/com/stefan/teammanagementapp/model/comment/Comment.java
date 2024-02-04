package com.stefan.teammanagementapp.model.comment;

import com.stefan.teammanagementapp.model.user.impl.UserImpl;

import java.time.Instant;

public interface Comment {

    Long getId();

    void setId(Long id);

    String getContent();

    void setContent(String content);

    UserImpl getAuthor();

    void setAuthor(UserImpl author);

    Instant getCreatedAt();

    void setCreatedAt(Instant createdAt);


}
