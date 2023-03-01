package com.events.upcoming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.upcoming.models.UserEvent;

public interface UserEventRepository extends JpaRepository<UserEvent, Long>{
    
}