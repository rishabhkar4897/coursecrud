package com.bharath.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.bharath.restws.entities.Course;
import com.bharath.restws.repos.CourseRepository;

public class CourseServiceImpl implements CoursesServices {

	@Autowired
	CourseRepository repository;

	@Override
	public List<Course> getCourse() {
		return repository.findAll();
	}

	@Override
	public Course getCourse(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createCourse(Course Course) {
		Course savedCourse = repository.save(Course);
		return Response.ok(savedCourse).build();
	}

	@Override
	public Response updateCourse(Course Course) {
		Course savedCourse = repository.save(Course);
		return Response.ok(savedCourse).build();
	}

}
