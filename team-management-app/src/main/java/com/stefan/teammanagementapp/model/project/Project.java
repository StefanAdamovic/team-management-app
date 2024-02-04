package com.stefan.teammanagementapp.model.project;

import com.stefan.teammanagementapp.model.comment.impl.CommentImpl;
import com.stefan.teammanagementapp.model.document.impl.DocumentImpl;
import com.stefan.teammanagementapp.model.status.Status;
import com.stefan.teammanagementapp.model.task.impl.TaskImpl;
import com.stefan.teammanagementapp.model.team.impl.TeamImpl;

import java.time.Instant;
import java.util.List;

public interface Project {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Instant getCreatedAt();

    void setCreatedAt(Instant createdAt);

    Instant getCompletedAt();

    void setCompletedAt(Instant completedAt);

    List<TeamImpl> getTeams();

    void setTeams(List<TeamImpl> teams);

    Status getStatus();

    void setStatus(Status status);

    List<DocumentImpl> getDocuments();

    void setDocuments(List<DocumentImpl> documents);

    List<CommentImpl> getComments();

    void setComments(List<CommentImpl> comments);

    List<TaskImpl> getTasks();

    void setTasks(List<TaskImpl> tasks);
}
