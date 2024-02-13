package com.stefan.teammanagementapp.model.project.impl;


import com.stefan.teammanagementapp.model.status.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectResponse {

    private Long id;

    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Size(min = 10, max = 300, message = "Description must be between 10 and 300 characters")
    @NotBlank(message = "Description cannot be blank")
    private String description;

    private Instant createdAt;

    private Instant completedAt;

    @NotNull(message = "Project status cannot be null")
    private Status status;

    public ProjectResponse(ProjectImpl project) {
        this.id = project.getId();
        this.name = project.getName();
        this.description = project.getDescription();
        this.createdAt = project.getCreatedAt();
        this.completedAt = project.getCompletedAt();
        this.status = project.getStatus();
    }

    //    private List<DocumentResourcePoint> documents;
//
//    private List<CommentResourcePoint> comments;
//
//    private List<TaskResourcePoint> tasks;
//
//    private List<TeamResourcePoint> teams;
}
