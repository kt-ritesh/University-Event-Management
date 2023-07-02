package com.ritesh.University.Event.Management.service;

import com.ritesh.University.Event.Management.model.Student;
import com.ritesh.University.Event.Management.model.depType;
import com.ritesh.University.Event.Management.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addaStudent(Student student) {
        studentRepo.save(student);
        return "One Student added!";
    }

    public String updateStudentDepartmentById(Integer id, depType dep) {
        Optional<Student> aStudent = studentRepo.findById(id);

        Student student;
        if(aStudent.isPresent()){
            student = aStudent.get();
        }else {
            return "Id not found";
        }
        student.setDepartment(dep);
        studentRepo.save(student);

        return "Student Department updated!";
    }

    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "Student deleted!";
    }

    public Optional<Student> GetAStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    public Iterable<Student> GetAllStudents() {
        return studentRepo.findAll();
    }
}
