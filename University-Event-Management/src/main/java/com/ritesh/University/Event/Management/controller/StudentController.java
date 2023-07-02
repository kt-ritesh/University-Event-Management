package com.ritesh.University.Event.Management.controller;

import com.ritesh.University.Event.Management.model.Student;
import com.ritesh.University.Event.Management.model.depType;
import com.ritesh.University.Event.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addAStudent(@RequestBody Student student){
        return studentService.addaStudent(student);
    }

    @PutMapping("student/{id}/{dep}")
    public String updateStudentDepartmentById(@PathVariable Integer id, @PathVariable depType dep){
        return studentService.updateStudentDepartmentById(id, dep);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }

    @GetMapping("student/{id}")
    public Optional<Student> GetAStudentById(@PathVariable Integer id){
        return studentService.GetAStudentById(id);
    }

    @GetMapping("students")
    public Iterable<Student> GetAllStudents(){
        return studentService.GetAllStudents();
    }
}
