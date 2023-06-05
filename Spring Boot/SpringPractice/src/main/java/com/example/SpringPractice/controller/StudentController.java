package com.example.SpringPractice.controller;

import com.example.SpringPractice.model.Courses;
import com.example.SpringPractice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.SpringPractice.repository.StudentRepository;
import com.example.SpringPractice.repository.CourseRepository;

import java.util.List;

@RestController
public class StudentController{

    @Autowired
    private StudentRepository studentRepo;
    @Autowired
    private CourseRepository courseRepo;

    @PostMapping(value = "/prachi", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/{studentId}")
    public Student findStudentById(@PathVariable Long studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }

    @GetMapping("/{studentName}")
    public List<Student> findStudentByName(@PathVariable String studentName) {
        return studentRepo.findByNameContaining(studentName);
    }

    @GetMapping("/search/{price}")
    public List<Courses> findCoursesLessThanFee(@PathVariable double price) {
        return courseRepo.findByFeeLessThan(price);
    }
}