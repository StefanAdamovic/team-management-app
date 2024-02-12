package com.stefan.teammanagementapp.repository;

import com.stefan.teammanagementapp.model.user.impl.UserImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserImpl, Long> {
}
