package com.restAPI.payload;
import com.restAPI.model.*;
import com.restAPI.repository.CourseRepository;
import com.restAPI.repository.StudentRepository;
import com.restAPI.repository.SubjectRepository;
import com.restAPI.repository.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Configuration
class LoadDatabase {
@Autowired
Student student;
    @Autowired
    Teacher teacher;
    @Autowired
    Courses courses;
    @Autowired
    Subject subject;
    @Autowired
    Subject subject1;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    CourseRepository courseRepository;
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    @Transactional
    CommandLineRunner initDatabase() {
        subject.setCourse(courses);
        subject.setSemister(Semisters.second);
        subject.setSubjectName("Microprocessor");

        subject.setCourse(courses);
        subject.setSemister(Semisters.third);
        subject.setSubjectName("Numerical Method");



        courses.setStudent(student);
        courses.setCourseName("BsC.CSIT");

        List<Subject> subjects=new ArrayList<>();
        subjects.add(subject);
        subjects.add(subject1);
        courses.setSubjects(subjects);
        List<Courses> courses1=new ArrayList<>();
        courses1.add(courses);

        student.setFirstName("Mahendra ");
        student.setLastName("Rimal");
        student.setAddress("Sanischere jhapa");
        student.setCourses(courses);


            teacher.setFirstName("lakshmi ");
            teacher.setLastName("Khawas");
            teacher.setSubjects(subjects);



        return args -> {
            log.info("Preloading " + studentRepository.save(student));
            log.info("Preloading " + teacherRepository.save(teacher));

            log.info("Preloading " + courseRepository.save(courses));
            log.info("Preloading " + subjectRepository.save(subject));


        };
    }
}