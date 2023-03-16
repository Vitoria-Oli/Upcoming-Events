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

import com.events.upcoming.models.Event;
import com.events.upcoming.services.EventService;

@RestController
@RequestMapping(path = "/api/events")
public class EventController {
    private EventService service;
    
    public EventController (EventService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Event> listAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Event listOne(@PathVariable Long id) {
        return service.getOne(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<?> store(@RequestBody Event newevent){
        
        try{
            return ResponseEntity.ok(service.save(newevent));
        } catch(Exception e){
            return ResponseEntity.status(500).body("error");
    }
}
 
}
