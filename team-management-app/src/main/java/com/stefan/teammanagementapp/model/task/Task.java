package com.stefan.teammanagementapp.model.task;

import com.stefan.teammanagementapp.model.comment.Comment;
import com.stefan.teammanagementapp.model.document.Document;
import com.stefan.teammanagementapp.model.project.Project;
import com.stefan.teammanagementapp.model.status.Status;

import java.time.Instant;
import java.util.List;

public interface Task {

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

    Project getProject();

    void setProject(Project project);

    List<Document> getDocuments();

    void setDocuments(List<Document> documents);

    List<Comment> getComments();

    void setComments(List<Comment> comments);

    Status getStatus();

    void setStatus(Status status);

    Instant getDueDate();

    void setDueDate(Instant dueDate);

    boolean getIsLate();

    void setIsLate();

    TaskPriority getTaskPriority();

    void setTaskPriority(TaskPriority taskPriority);


}
