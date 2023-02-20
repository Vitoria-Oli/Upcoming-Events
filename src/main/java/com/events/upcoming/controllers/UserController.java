package com.events.upcoming.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.events.upcoming.models.User;
import com.events.upcoming.services.UserService;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private UserService service;
    
    public UserController (UserService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<User> listAll(){
        return service.getAll();
    }
}