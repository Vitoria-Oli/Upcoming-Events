package com.events.upcoming.services;

import org.springframework.stereotype.Service;
import com.events.upcoming.models.User;
import com.events.upcoming.repositories.UserRepository;




import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}
