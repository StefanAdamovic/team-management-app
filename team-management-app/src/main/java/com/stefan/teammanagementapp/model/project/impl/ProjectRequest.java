package com.stefan.teammanagementapp.model.project.impl;

import com.stefan.teammanagementapp.model.status.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectRequest {

    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Size(min = 10, max = 300, message = "Description must be between 10 and 300 characters")
    @NotBlank(message = "Description cannot be blank")
    private String description;

    @NotNull(message = "Project status cannot be null")
    private Status status;
}
