package com.springrest.springrest.controller;

import com.springrest.springrest.model.Courses;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {
    // REST -> Representational State Transfer

//    @GetMapping("/home")
//    public String home(){
//        return "home page";
//    }

    @Autowired
    private CourseService courseService;

//    Get the Courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(value = "/courses")
    public Courses addCourse(@RequestBody Courses course){
        return this.courseService.addCourse(course);
    }
}
