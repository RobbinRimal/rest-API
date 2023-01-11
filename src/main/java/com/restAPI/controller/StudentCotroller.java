//package com.restAPI.controller;
//
//import com.restAPI.repository.StudentRepository;
//import com.restAPI.model.Student;
//import com.restAPI.utilities.StudentModelAssembler;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.CollectionModel;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.IanaLinkRelations;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@RestController()
//
//
//public class StudentCotroller {
//    @Autowired
//    private StudentModelAssembler studentModelAssembler;
//    @Autowired
//   private StudentRepository studentRepository;
//    @GetMapping("/students")
//    public CollectionModel<EntityModel<Student>> all() {
//        List<EntityModel<Student>> studentsList =studentRepository.findAll().stream().map(
//                student -> studentModelAssembler.toModel(student)
//        ).collect(Collectors.toList());
//
//        return CollectionModel.of(studentsList,linkTo(methodOn(StudentCotroller.class).all()).withSelfRel());
//    }
//    @PostMapping("/student")
//    ResponseEntity<?> newStudent(@RequestBody Student newStudent) {
//        EntityModel<Student> entityModel=studentModelAssembler.toModel(studentRepository.save(newStudent));
//        return ResponseEntity.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()).body(entityModel);
//
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Student> getStudent(@PathVariable Long id){
//    Optional<Student> student;
//    student=studentRepository.findById(id);
//
//return student;
//
//
//
//    }
//
//
//    @PutMapping("student/id")
//    ResponseEntity<?> updateStudent(@RequestBody Student newstudent, @PathVariable Long id) {
//      Student updateStudent=  studentRepository.findById(id).map(
//                student -> {
//                    student.setFirstName(newstudent.getFirstName());
//                    student.setLastName(newstudent.getLastName());
//                    student.setAddress(student.getAddress());
//                    return studentRepository.save(student);
//                }
//        ).orElseGet(() -> {
//            newstudent.setID(id);
//            return studentRepository.save(newstudent);
//        });
//      EntityModel<Student> entityModel=studentModelAssembler.toModel(updateStudent);
//      return ResponseEntity.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()).body(entityModel);
//
//
//
//    }
//    @DeleteMapping("student/{id}")
//   ResponseEntity<?> deleteStudent(@PathVariable long id){
//        studentRepository.deleteById(id);
//        return  ResponseEntity.noContent().build();
//    }
//
//
//
//}
//
