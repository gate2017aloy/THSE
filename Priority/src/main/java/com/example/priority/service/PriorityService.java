package com.example.priority.service;

import com.example.priority.models.Priority;
import com.example.priority.noSqlRepos.ResponseRepository;
import com.example.priority.sql_repos.PriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Service
public class PriorityService {
    @Autowired
    PriorityRepo priorityRepo;

//    @Autowired
//    ResponseRepository responseRepository;

    public List<Priority> getAllPriorities()
    {
        List<Priority> priorities = new ArrayList<>();
        priorities.addAll(priorityRepo.findAll());
        System.out.println("prioritiesL " + priorities);
        return priorities;
    }

    public long setPriorities(@PathVariable long id) {

        return id;
    }

}
