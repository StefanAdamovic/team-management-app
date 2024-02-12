package com.stefan.teammanagementapp.repository;

import com.stefan.teammanagementapp.model.team.impl.TeamImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamImpl, Long> {
}
