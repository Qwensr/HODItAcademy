package com.example.HODItAcademy.controller;

import com.example.HODItAcademy.entity.Event;
import com.example.HODItAcademy.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EventController {

    // Замените это фиктивное хранилище на ваш реальный источник данных
    private final EventService eventService;
    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public String showEvents(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events";
    }

    @GetMapping("/events/design")
    public String showDesignEvent(Model model) {
        Event designEvent = eventService.getEventById("design-event-id");
        model.addAttribute("event", designEvent);
        return "design-event";
    }

    @GetMapping("/events/chess")
    public String showChessEvent(Model model) {
        Event chessEvent = eventService.getEventById("chess-event-id");
        model.addAttribute("event", chessEvent);
        return "chess-event";
    }

    @GetMapping("/events/battles")
    public String showBattlesEvent(Model model) {
        Event battlesEvent = eventService.getEventById("battles-event-id");
        model.addAttribute("event", battlesEvent);
        return "battles-event";
    }

    @GetMapping("/events/movies")
    public String showMoviesEvent(Model model) {
        Event moviesEvent = eventService.getEventById("movies-event-id");
        model.addAttribute("event", moviesEvent);
        return "movies-event";
    }

    @GetMapping("/events/games")
    public String showGamesEvent(Model model) {
        Event gamesEvent = eventService.getEventById("games-event-id");
        model.addAttribute("event", gamesEvent);
        return "games-event";
    }

    @GetMapping("/events/it")
    public String showItEvent(Model model) {
        Event itEvent = eventService.getEventById("it-event-id");
        model.addAttribute("event", itEvent);
        return "it-event";
    }
}
