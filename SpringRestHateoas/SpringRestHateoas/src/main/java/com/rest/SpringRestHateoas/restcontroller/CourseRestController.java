package com.rest.SpringRestHateoas.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseRestController {
	
	@GetMapping("/getcourse/{id}")
	public ResponseEntity<Course> getCourseDetails(@PathVariable("id") Integer id) {
		Course course=new Course(106,"SB",4544.45);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@GetMapping("/getallcourses")
	public List<Course> getCourseDetails() {
		List<Course> courses=new ArrayList<Course>();
		courses.add(new Course(106,"SB",4544.45)) ;
		courses.add(new Course(107,"SB1",4785.45)) ;
		courses.add(new Course(108,"SB3",2547.45)) ;
		
		return courses;
	}
	
	@GetMapping("/getthread/{id}")
	public ResponseEntity<Course> getJavaCourse(@PathVariable("id") Integer id) {
		Course course=new Course(146,"Multhi threading",4544.45);
		
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseRestController.class).getCourseDetails()).withRel("/api/getallcourses");
		course.add(link);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}

}
