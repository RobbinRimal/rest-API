package com.restAPI.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Courses {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long courseId;
    @OneToOne
    private  Student student;
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
}
