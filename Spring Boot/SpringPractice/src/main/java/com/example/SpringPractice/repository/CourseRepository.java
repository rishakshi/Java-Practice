package com.example.SpringPractice.repository;

import com.example.SpringPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Student, Long> {

    List<Student> findByFeeLessThan(double price);
}