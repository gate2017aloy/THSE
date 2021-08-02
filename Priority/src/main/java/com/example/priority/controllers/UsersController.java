package com.example.priority.controllers;

import com.example.priority.models.User;
import com.example.priority.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@RestController
@RequestMapping("/v1/api/users")
public class UsersController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    UsersService usersService;

    @GetMapping(path = "/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        Optional<User> user = this.usersService.getUserById(id);
        return user;
    }

    @GetMapping(path = "/")
    public List<User> getAllUsers(){
        List<User> users = this.usersService.getAllUsers();
        LOG.warn(String.valueOf(users));
        return users;
    }

}
