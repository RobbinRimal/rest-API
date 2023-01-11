package com.restAPI.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Entity
@Component
public class Courses {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long courseId;
    @OneToOne
    private  Student student;
    private String courseName;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "course")

    private List<Subject> subjects=new ArrayList<>();

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
