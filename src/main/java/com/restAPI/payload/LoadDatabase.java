//package com.restAPI.payload;
//import com.restAPI.repository.StudentRepository;
//import com.restAPI.model.Student;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//class LoadDatabase {
//@Autowired
//Student student;
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(StudentRepository repository) {
//        student.setFirstName("Mahendra ");
//        student.setLastName("Rimal");
//        student.setAddress("Sanischere jhapa");
//
//        return args -> {
//
//
//            //log.info("Preloading " + repository.save(student));
//
//        };
//    }
//}