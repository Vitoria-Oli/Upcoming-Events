package com.events.upcoming.services;

import org.springframework.stereotype.Service;

import com.events.upcoming.models.Event;
import com.events.upcoming.repositories.EventRepository;

import java.util.List;

@Service
public class EventService {
    private EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAll() {
        return repository.findAll();
    }
}
