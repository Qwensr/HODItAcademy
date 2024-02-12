package com.example.HODItAcademy.repo;

import com.example.HODItAcademy.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,String> {
    List<Event> getAllEvents();

    Event getEventById(String eventId);
}
