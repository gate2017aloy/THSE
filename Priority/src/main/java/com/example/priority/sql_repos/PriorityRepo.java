package com.example.priority.sql_repos;

import com.example.priority.models.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepo extends JpaRepository<Priority, String> {
}
