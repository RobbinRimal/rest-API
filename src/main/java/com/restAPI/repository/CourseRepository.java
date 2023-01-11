package com.restAPI.repository;

import com.restAPI.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Courses,Long> {
}
