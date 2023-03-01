package com.events.upcoming.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    private boolean recommended;
    @Column(nullable = false)
    private Long capacity;


   

    @OneToMany
    @JoinColumn(name = "id_event")
    private List<Image> image;

    public Event() {
    }

    public Event(Long id, String name, String description, LocalDate date, LocalTime hour, boolean recommended,
            List<Image> image, Long capacity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.hour = hour;
        this.recommended = recommended;
        this.image = image;
        this.capacity = capacity;
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


    public boolean isRecommended() {
        return recommended;
    }


    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }




    public List<Image> getImage() {
        return image;
    }


    public void setImage(List<Image> image) {
        this.image = image;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

  
}