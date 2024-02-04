package com.stefan.teammanagementapp.model.task;

import com.stefan.teammanagementapp.model.comment.impl.CommentImpl;
import com.stefan.teammanagementapp.model.document.impl.DocumentImpl;
import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
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

    ProjectImpl getProject();

    void setProject(ProjectImpl project);

    List<DocumentImpl> getDocuments();

    void setDocuments(List<DocumentImpl> documents);

    List<CommentImpl> getComments();

    void setComments(List<CommentImpl> comments);

    Status getStatus();

    void setStatus(Status status);

    Instant getDueDate();

    void setDueDate(Instant dueDate);

    Boolean getIsLate();

    void setIsLate(Boolean isLate);

    TaskPriority getTaskPriority();

    void setTaskPriority(TaskPriority taskPriority);


}
