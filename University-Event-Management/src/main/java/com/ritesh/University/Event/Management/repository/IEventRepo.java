package com.ritesh.University.Event.Management.repository;

import com.ritesh.University.Event.Management.model.Event;
import jakarta.validation.Valid;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends CrudRepository<Event, Integer> {

    List<Event> findByDate(LocalDate date);
}
