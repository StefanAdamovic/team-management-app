package com.stefan.teammanagementapp.model.team.impl;

import com.stefan.teammanagementapp.model.project.impl.ProjectImpl;
import com.stefan.teammanagementapp.model.team.Team;
import com.stefan.teammanagementapp.model.user.impl.UserImpl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "team")
public class TeamImpl implements Team {

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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_lead_id", nullable = false)
    private UserImpl teamLead;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserImpl> teamMembers;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<ProjectImpl> projects;

}
