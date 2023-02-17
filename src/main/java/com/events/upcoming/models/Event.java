package com.events.upcoming.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_event")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private java.time.LocalDate date;
    @Column(nullable = false)
    private java.time.LocalTime hour;
    @Column(nullable = false)
    private String image;
    @Column(nullable = false)
    private int capacity;
    
    @OneToOne 
    private FreePlaces freeplaces;
    @OneToOne
    private Recommended recommended;

    public Event() {
    }


    public Event(Long id, String name, String description, LocalDate date, LocalTime hour, String image, int capacity,
            FreePlaces freeplaces, Recommended recommended) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.hour = hour;
        this.image = image;
        this.capacity = capacity;
        // this.freeplaces = freeplaces;
        // this.recommended = recommended;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.time.LocalDate getDate() {
        return date;
    }

    public void setDate(java.time.LocalDate date) {
        this.date = date;
    }

    public java.time.LocalTime getHour() {
        return hour;
    }

    public void setHour(java.time.LocalTime hour) {
        this.hour = hour;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FreePlaces getFreeplaces() {
        return freeplaces;
    }

    public void setFreeplaces(FreePlaces freeplaces) {
        this.freeplaces = freeplaces;
    }

    public Recommended getRecommended() {
        return recommended;
    }

    public void setRecommended(Recommended recommended) {
        this.recommended = recommended;
    }
}