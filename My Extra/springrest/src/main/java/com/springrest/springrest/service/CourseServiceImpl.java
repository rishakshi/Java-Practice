package com.springrest.springrest.service;

import com.springrest.springrest.model.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Courses> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Courses(145, "Java", "Java course"));
        list.add(new Courses(150, "python", "python course"));
        list.add(new Courses(155, "spring", "spring course"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for (Courses course : list) {
            if(course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses course) {
        list.add(course);
        return course;
    }
}
