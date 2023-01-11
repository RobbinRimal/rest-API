package com.restAPI.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Entity
@Component
public class Teacher {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long teacherId;
    private  String firstName;
    private  String lastName;
    @ManyToMany
    @JoinTable(name=" teacher_subjects",
            joinColumns = @JoinColumn(name = "Teacher_Subjects"),
            inverseJoinColumns = @JoinColumn(name = "Subjects_Teacher")

    )
    private List<Subject> subjects;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
