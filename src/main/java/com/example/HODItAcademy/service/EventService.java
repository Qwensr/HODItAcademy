package com.example.HODItAcademy.service;

import com.example.HODItAcademy.entity.Event;
import com.example.HODItAcademy.repo.EventRepository;

import java.util.List;

public interface EventService {
    final EventRepository eventRepository ;

    List<Event> getAllEvents();

    Event getEventById(String eventId);
}
