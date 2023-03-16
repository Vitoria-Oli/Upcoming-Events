package com.events.upcoming.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.events.upcoming.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class UserTest {

    @Autowired
    UserRepository repository;

    @Autowired
    EntityManager entityManager;

  
    @Test
    void testGetUserName() {
        User newUser = new User(null, "nuevo@.es", "123456", null, null);
        User storedUser = repository.save(newUser);
    
        User findedUser = entityManager.find(User.class, storedUser.getUserName());
    
        assertEquals("nuevo@.es", findedUser.getUserName());
    
        
    }
}
