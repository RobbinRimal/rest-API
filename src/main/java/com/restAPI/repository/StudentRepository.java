package com.restAPI.repository;

import com.restAPI.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public  interface StudentRepository extends CrudRepository<Student,Long> {
}
