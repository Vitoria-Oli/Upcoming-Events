package com.events.upcoming.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_event")
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_userevent")
    private Long id;

    @Column(name = "user_id_user")
    private Long id_user;
    @Column(name = "event_id_event")
    private Long id_event;
    
    public UserEvent() {
    }

    public UserEvent(Long id, Long id_user, Long id_event) {
        this.id = id;
        this.id_user = id_user;
        this.id_event = id_event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_event() {
        return id_event;
    }

    public void setId_event(Long id_event) {
        this.id_event = id_event;
    }


    
}

