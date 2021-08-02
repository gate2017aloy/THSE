package com.example.priority.service;

import com.example.priority.documents.UsersResponse;
import com.example.priority.models.Priority;
import com.example.priority.models.User;
import com.example.priority.noSqlRepos.ResponseRepository;
import com.example.priority.sql_repos.PriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class PriorityService {
    @Autowired
    PriorityRepo priorityRepo;

    @Autowired
    ResponseRepository responseRepository;

    @Autowired
    UsersService usersService;

    public List<Priority> getAllPriorities()
    {
        List<Priority> priorities = new ArrayList<>();
        priorities.addAll(priorityRepo.findAll());
        return priorities;
    }

    public long setPrioritiesForUser(long id, UsersResponse response) {
        Optional<User> user = this.usersService.getUserById(id);
        System.out.println(user.isPresent());
        if(!user.isPresent()) {
            System.out.println("user not present");
            return -1;
        }
        responseRepository.save(response);
        return id;
    }

    public Optional<UsersResponse> getPrioritiesForUser(long id) {
        return responseRepository.findById(id);
    }

}
