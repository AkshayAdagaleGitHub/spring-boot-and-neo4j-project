package com.student.spring.boot.and.neo4j.project.controller;

import com.student.spring.boot.and.neo4j.project.entity.Student;
import com.student.spring.boot.and.neo4j.project.request.CreateStudentRequest;
import com.student.spring.boot.and.neo4j.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        return studentService.createStudent(createStudentRequest);
    }
}
