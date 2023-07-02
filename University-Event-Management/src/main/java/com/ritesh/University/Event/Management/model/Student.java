package com.ritesh.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

    @Id
    private Integer studentId;
    @Pattern(regexp = "^[A-Z].*$")
    private String studentFirstName;
    private String studentSecondName;

    @Min(18)
    @Max(25)
    private Integer studentAge;
    private depType department;
}
