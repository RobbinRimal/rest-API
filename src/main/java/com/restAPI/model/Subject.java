package com.restAPI.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
public class Subject {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long subjectId;
    @ManyToOne
    private Courses course;
    @Enumerated(value = EnumType.STRING)
    private  Semisters semister ;

    private  String subjectName;
    @ManyToMany(mappedBy = "subjects")
    private List<Teacher> teachers;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Semisters getSemister() {
        return semister;
    }

    public void setSemister(Semisters semister) {
        this.semister = semister;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
