package com.stefan.teammanagementapp.model.comment.impl;

import com.stefan.teammanagementapp.model.comment.Comment;
import com.stefan.teammanagementapp.model.user.impl.UserImpl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "comment")
public class CommentImpl implements Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 30, max = 300, message = "Content must be between 2 and 50 characters")
    @Column(name = "content")
    @NotBlank(message = "Content cannot be blank")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private UserImpl author;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Instant createdAt;
}
