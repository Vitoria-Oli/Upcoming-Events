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

    public User getOne(Long id) {
        User user = repository.findById(id).orElse(null);
        return user;
       
    }
    public User save(User user){
        User newuser=repository.save(user);
        return newuser;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
