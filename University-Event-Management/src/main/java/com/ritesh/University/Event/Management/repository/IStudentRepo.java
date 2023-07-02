package com.ritesh.University.Event.Management.repository;

import com.ritesh.University.Event.Management.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student, Integer>{
}
