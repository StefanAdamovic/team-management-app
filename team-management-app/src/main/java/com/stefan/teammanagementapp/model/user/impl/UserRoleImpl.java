package com.stefan.teammanagementapp.model.user.impl;

import com.stefan.teammanagementapp.model.user.UserRole;
import com.stefan.teammanagementapp.model.user.UserRoleName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_role")
public class UserRoleImpl implements UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    @NotNull(message = "Name cannot be null")
    private UserRoleName name;

    @Size(min = 10, max = 300, message = "Description must be between 2 and 300 characters")
    @Column(name = "description")
    @NotBlank(message = "Description cannot be blank")
    private String description;

}
