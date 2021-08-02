package com.example.priority.sql_repos;

import com.example.priority.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo  extends JpaRepository<User, Long>{
    Optional<User> findById(String id);
}
