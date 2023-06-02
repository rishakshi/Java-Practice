package com.example.SpringPractice.controller;

import com.example.SpringPractice.model.Student;
import org.springframework.web.bind.annotation.*;
import com.example.SpringPractice.repository.StudentRepository;
import com.example.SpringPractice.repository.CourseRepository;

import java.util.List;

@RestController
public class StudentController{

    private StudentRepository studentRepo;
    private CourseRepository courseRepo;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping
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
    public List<Student> findCoursesLessThanFee(@PathVariable double price) {
        return courseRepo.findByFeeLessThan(price);
    }
}