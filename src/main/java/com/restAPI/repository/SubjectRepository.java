package com.restAPI.repository;

import com.restAPI.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
