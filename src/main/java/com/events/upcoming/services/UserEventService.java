package com.events.upcoming.services;
import org.springframework.stereotype.Service;
import com.events.upcoming.models.UserEvent;
import com.events.upcoming.repositories.UserEventRepository;

import java.util.List;

@Service
public class UserEventService {
    private UserEventRepository repository;

    public UserEventService(UserEventRepository repository) {
        this.repository = repository;
    }

    public List<UserEvent> getAll() {
        return repository.findAll();
    }

    public UserEvent save(UserEvent userevent){
        UserEvent newuserevent=repository.save(userevent);
        return newuserevent;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }



}
