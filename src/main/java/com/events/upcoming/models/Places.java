package com.events.upcoming.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "places")
public class Places {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_places")
    private Long id;
    @Column(nullable = false)
    private int capacity;
    @Column(nullable = false)
    private int freeplaces;
    
    public Places() {
    }
    
    public Places(Long id, int freeplaces, int capacity) {
        this.id = id;
        this.freeplaces = freeplaces;
        this.capacity = capacity;    
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}