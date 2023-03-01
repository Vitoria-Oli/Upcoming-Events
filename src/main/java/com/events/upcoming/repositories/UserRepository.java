package com.events.upcoming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.upcoming.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}