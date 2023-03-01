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

import com.events.upcoming.models.UserEvent;
import com.events.upcoming.services.UserEventService;

@RestController
@RequestMapping(path = "/api/usersevent")
public class UserEventController {
    private UserEventService service;
    
    public UserEventController (UserEventService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<UserEvent> listAll(){
        return service.getAll();
    }
 
    @PostMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody UserEvent newuserevent){
        
        try{
            return ResponseEntity.ok(service.save(newuserevent));
        } catch(Exception e){
            return ResponseEntity.status(500).body("error");
    }
}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}