package com.events.upcoming.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "freeplaces")
public class FreePlaces {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_freeplaces")
    private Long id;
    @Column(nullable = false)
    private int freeplaces;
    
    @OneToOne 
    private Event event;
    
    public FreePlaces() {
    }

    public FreePlaces(Long id, int freeplaces) {
        this.id = id;
        this.freeplaces = freeplaces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFreeplaces() {
        return freeplaces;
    }

    public void setFreeplaces(int freeplaces) {
        this.freeplaces = freeplaces;
    }

}