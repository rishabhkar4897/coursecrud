package com.bharath.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.restws.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
