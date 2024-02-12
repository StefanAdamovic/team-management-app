package com.stefan.teammanagementapp.repository;

import com.stefan.teammanagementapp.model.task.impl.TaskImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskImpl, Long> {
}
