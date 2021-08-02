package com.example.priority.controllers;

import com.example.priority.documents.UsersResponse;
import com.example.priority.models.Priority;
import com.example.priority.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@RestController()
@RequestMapping("/v1/api/priority")
public class PriorityController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    PriorityService priorityService;

    @GetMapping("/")
    public String demo() {
        return "Hello World";
    }

    @GetMapping("/getPriorities")
    public List<Priority> getPriorities() {
        return priorityService.getAllPriorities();
    }

    @PostMapping("/setPrioritiesForUser/{id}")
    public long setPrioritiesForUser(@PathVariable long id, @RequestBody UsersResponse response) {
        return priorityService.setPrioritiesForUser(id, response);
    }

    @GetMapping("/getPrioritiesForUser/{id}")
    public Optional<UsersResponse> getPrioritiesForUser(@PathVariable long id) {
        return priorityService.getPrioritiesForUser(id);
    }


}
