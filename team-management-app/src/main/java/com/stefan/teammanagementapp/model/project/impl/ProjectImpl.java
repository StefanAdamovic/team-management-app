package com.stefan.teammanagementapp.model.project.impl;

import com.stefan.teammanagementapp.model.comment.impl.CommentImpl;
import com.stefan.teammanagementapp.model.document.impl.DocumentImpl;
import com.stefan.teammanagementapp.model.project.Project;
import com.stefan.teammanagementapp.model.status.Status;
import com.stefan.teammanagementapp.model.task.impl.TaskImpl;
import com.stefan.teammanagementapp.model.team.impl.TeamImpl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "project")
public class ProjectImpl implements Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @Column(name = "name")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Size(min = 10, max = 300, message = "Description must be between 10 and 300 characters")
    @Column(name = "description")
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Instant createdAt;

    @Column(name = "completed_at")
    private Instant completedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "project_status")
    @NotNull(message = "Project status cannot be null")
    private Status status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DocumentImpl> documents;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CommentImpl> comments;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TaskImpl> tasks;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<TeamImpl> teams;

    public ProjectImpl(ProjectRequest projectRequest) {

        this.name = projectRequest.getName();
        this.description = projectRequest.getDescription();
        this.status = projectRequest.getStatus();

    }
}
