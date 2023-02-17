package com.events.upcoming.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}