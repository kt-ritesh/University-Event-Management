package com.ritesh.University.Event.Management.service;

import com.ritesh.University.Event.Management.model.Event;
import com.ritesh.University.Event.Management.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public String addaEvent(Event event) {
        eventRepo.save(event);
        return "Event Added!";
    }

    public String updateEvent(Event event) {
        eventRepo.save(event);

        return "Event updated!";
    }

    public String deleteEventById(Integer id) {
        eventRepo.deleteById(id);
        return "Event Deleted!";
    }

    public List<Event> getEventByDate(LocalDate date) {
        return eventRepo.findByDate(date);
    }

    public Iterable<Event> getAllEvent() {
        return eventRepo.findAll();
    }
}
