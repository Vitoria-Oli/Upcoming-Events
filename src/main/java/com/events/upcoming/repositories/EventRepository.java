package com.events.upcoming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.upcoming.models.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
    
}