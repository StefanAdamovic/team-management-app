package com.stefan.teammanagementapp.model.notification.impl;

import com.stefan.teammanagementapp.model.notification.Notification;
import com.stefan.teammanagementapp.model.notification.NotificationStatus;
import com.stefan.teammanagementapp.model.user.impl.UserImpl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "notification")
public class NotificationImpl implements Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Instant createdAt;

    @Size(min = 30, max = 300, message = "Content must be between 2 and 50 characters")
    @Column(name = "content")
    @NotBlank(message = "Content cannot be blank")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private UserImpl user;

    @Enumerated(EnumType.STRING)
    @Column(name = "notification_status")
    @NotNull(message = "Notification status cannot be null")
    private NotificationStatus notificationStatus;
}
