package com.example.priority.controllers;

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

//    @GetMapping("/getPriorities")
//    public List<String> getPriorities() {
//        List<String> res = new ArrayList<>();
//        res.add("Connection");
//        res.add("Relationships");
//        res.add("Career");
//        res.add("Wealth");
//        return res;
//    }

    @GetMapping("/getPriorities")
    public List<Priority> getPriorities() {
        return priorityService.getAllPriorities();
    }

    @PostMapping("/setPrioritiesForUser/{id}")
    public long setPriorities(@PathVariable long id) {

        return id;
    }

}
