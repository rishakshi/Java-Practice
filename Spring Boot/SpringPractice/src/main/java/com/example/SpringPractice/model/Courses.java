package com.example.SpringPractice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="COURSE_TBL")
public class Courses {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String abbr;
    private int modules;
    private double fee;

    @ManyToMany(mappedBy="courses", fetch=FetchType.LAZY)
    @JsonBackReference
    private Set<Student> students;
}
