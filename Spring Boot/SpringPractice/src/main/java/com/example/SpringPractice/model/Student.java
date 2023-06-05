package com.example.SpringPractice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="STUDENT_TBL")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String dept;

    @ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinTable(
        name="STUDENT_COURSE_TBL",
        joinColumns=@JoinColumn(name="student_id", referencedColumnName="id"),
        inverseJoinColumns={
            @JoinColumn(name="course_id", referencedColumnName="id")
        }
    )
//    @JsonManagedReference
    private Set<Courses> courses;
}
