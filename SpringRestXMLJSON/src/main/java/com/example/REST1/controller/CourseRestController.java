package com.example.REST1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseRestController {
	
	@PostMapping(value="/addcourse")
	public ResponseEntity<String> addCourseDetails(@RequestBody Course course){
		
		System.out.println(course);
		String msg="Course details added into db";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getcourse" )//, produces= {"application/xml","application/json"})
	public Course getCourseDetails(){
		
		Course course=new Course(101, "Spring Boot", 2345.23);
		System.out.println(course);
		return course;
		
	}
	

}
