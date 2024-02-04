package com.stefan.teammanagementapp.model.document.impl;

import com.stefan.teammanagementapp.model.document.Document;
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
@Table(name = "document")
public class DocumentImpl implements Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 10, message = "File type must be between 1 and 10 characters")
    @Column(name = "file_type")
    @NotBlank(message = "File type cannot be blank")
    private String fileType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private UserImpl uploadedBy;

    @Column(name = "uploaded_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Instant uploadedAt;

    @Column(name = "file_content")
    @Lob
    private byte[] fileContent;
}
