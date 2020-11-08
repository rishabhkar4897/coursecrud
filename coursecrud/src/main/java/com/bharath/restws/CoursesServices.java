package com.bharath.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bharath.restws.entities.Course;

@Consumes("application/json")
@Produces("application/json")
@Path("/courses")
public interface CoursesServices {

	@Path("/coursedetails")
	@GET
	List<Course> getCourse();
	
	@Path("/coursedetails/{id}")
	@GET
	Course getCourse(@PathParam(value = "id") int id); 
	
	@Path("/coursedetails")
	@POST
	Response createCourse(Course course);
	
	@Path("/coursedetails")
	@PUT
	Response updateCourse(Course course);
	
}
