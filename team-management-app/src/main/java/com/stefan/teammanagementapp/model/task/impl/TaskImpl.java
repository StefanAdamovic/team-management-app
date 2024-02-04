package com.stefan.teammanagementapp.model.task.impl;

import com.stefan.teammanagementapp.model.comment.impl.CommentImpl;
import com.stefan.teammanagementapp.model.document.impl.DocumentImpl;
import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
import com.stefan.teammanagementapp.model.status.Status;
import com.stefan.teammanagementapp.model.task.Task;
import com.stefan.teammanagementapp.model.task.TaskPriority;
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
@Table(name = "task")
public class TaskImpl implements Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "task_priority")
    @NotNull(message = "TaskPriority cannot be null")
    private TaskPriority taskPriority;

    @Size(min = 10, max = 300, message = "Description must be between 2 and 300 characters")
    @Column(name = "description")
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Instant createdAt;

    @Column(name = "completed_at", nullable = false)
    private Instant completedAt;

    @Column(name = "due_date", nullable = false)
    private Instant dueDate;

    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Column(name = "name")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private ProjectImpl project;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DocumentImpl> documents;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CommentImpl> comments;

    @Enumerated(EnumType.STRING)
    @Column(name = "task_status")
    @NotNull(message = "Task status cannot be null")
    private Status status;

    @Column(name = "is_late")
    @NotNull(message = "isLate field cannot be null")
    private Boolean isLate;


}
