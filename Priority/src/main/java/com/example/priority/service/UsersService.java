package com.example.priority.service;

import com.example.priority.models.User;
import com.example.priority.sql_repos.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepo repo;

    public Optional<User> getUserById(long id){
        Optional<User> user = this.repo.findById(id);
        return user;
    }

    public List<User> getAllUsers(){
        List<User> users = this.repo.findAll();
        return users;
    }
}
