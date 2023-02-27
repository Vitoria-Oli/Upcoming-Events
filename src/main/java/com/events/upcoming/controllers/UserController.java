package com.events.upcoming.controllers;

import java.util.List;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @GetMapping("/{id}")
    public User listOne(@PathVariable Long id) {
        return service.getOne(id);

    }
    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody User newuser){
        
        try{
            return ResponseEntity.ok(service.save(newuser));
        } catch(Exception e){
            return ResponseEntity.status(500).body("error");
    }
}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}