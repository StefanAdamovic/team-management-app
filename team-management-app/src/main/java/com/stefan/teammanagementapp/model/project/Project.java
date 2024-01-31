package com.stefan.teammanagementapp.model.project;

import com.stefan.teammanagementapp.model.comment.Comment;
import com.stefan.teammanagementapp.model.document.Document;
import com.stefan.teammanagementapp.model.status.Status;
import com.stefan.teammanagementapp.model.task.Task;
import com.stefan.teammanagementapp.model.team.Team;

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

    List<Team> getTeams();

    void setTeams(List<Team> teams);

    Status getStatus();

    void setStatus(Status status);

    List<Document> getDocuments();

    void setDocuments(List<Document> documents);

    List<Comment> getComments();

    void setComments(List<Comment> comments);


    List<Task> getTasks();

    void setTasks(List<Task> tasks);
}
