package com.example.HODItAcademy.entity;

public class Event {
    private String id;
    private String name;
    private String description;

    public Event(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

