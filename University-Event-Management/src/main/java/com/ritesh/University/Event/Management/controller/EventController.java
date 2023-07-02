package com.ritesh.University.Event.Management.controller;

import com.ritesh.University.Event.Management.model.Event;
import com.ritesh.University.Event.Management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addAEvent(@RequestBody Event event){
       return eventService.addaEvent(event);
    }

    @PutMapping("event/update")
    public String updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }

    @DeleteMapping("event/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }

    @GetMapping("event/{date}")
    public List<Event> getEventByDate(@PathVariable LocalDate date){
        return eventService.getEventByDate(date);
    }

    @GetMapping("events")
    public Iterable<Event> getAllEvent(){
        return eventService.getAllEvent();
    }

}
