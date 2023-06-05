package com.springrest.springrest.service;

import com.springrest.springrest.model.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourse(long courseId);
    public Courses addCourse(Courses course);
}
