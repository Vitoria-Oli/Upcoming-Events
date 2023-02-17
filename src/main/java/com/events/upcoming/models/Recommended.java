package com.events.upcoming.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recommended")
public class Recommended {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_recommended")
    private Long id;
    @Column(nullable = false)
    private boolean recommended;


    @OneToOne
    private Event event;

    public Recommended() {
    }

    public Recommended(Long id, boolean recommended) {
        this.id = id;
        this.recommended = recommended;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }


}