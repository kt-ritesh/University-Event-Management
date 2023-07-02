package com.ritesh.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    @Pattern(regexp = "^([0-5][0-9]):([0-5][0-9])$")
    private String startTime;
    @Pattern(regexp = "^([0-5][0-9]):([0-5][0-9])$")
    private String endTime;
}
