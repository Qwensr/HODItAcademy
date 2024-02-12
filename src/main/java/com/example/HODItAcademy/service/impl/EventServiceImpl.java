package com.example.HODItAcademy.service.impl;

import com.example.HODItAcademy.entity.Event;
import com.example.HODItAcademy.service.EventService;

import java.util.ArrayList;
import java.util.List;

public class EventServiceImpl implements EventService {

    private static List<Event> events = new ArrayList<>();

    static {
        events.add(new Event("design-event-id", "Design UX/UI Event", "Описание мероприятия по дизайну"));
        events.add(new Event("chess-event-id", "Chess Event", "Описание шахматного мероприятия"));
        events.add(new Event("battles-event-id", "Battles Event", "Описание соревновательных битв"));
        events.add(new Event("movies-event-id", "Movies Event", "Описание кинематографического мероприятия"));
        events.add(new Event("games-event-id", "Games Event", "Описание мероприятия по играм"));
        events.add(new Event("it-event-id", "It Event", "Описание IT-мероприятия"));
    }
    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public Event getEventById(String eventId) {
        return null;
    }
}
