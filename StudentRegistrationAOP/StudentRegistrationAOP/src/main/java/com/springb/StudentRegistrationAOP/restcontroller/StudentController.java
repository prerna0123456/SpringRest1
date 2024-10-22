package com.springb.StudentRegistrationAOP.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springb.StudentRegistrationAOP.dao.Student;
import com.springb.StudentRegistrationAOP.service.StudentRegService;

@RestController
public class StudentController {
	
	@Autowired
	StudentRegService service;
	
	@PostMapping("/register")
	public ResponseEntity<Student> registerStudent(@RequestBody Student s){
		service.registerStudent(s);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	
	@GetMapping("/findByID/{id}")
	public ResponseEntity<Student> fetchStudentByID(@PathVariable Integer id) throws Exception{
		Student student = service.getStudentbyID(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	

	@GetMapping("/findAllStudents")
	public ResponseEntity<List> fetchAllStudents(){
		List<Student> students = service.getAllStudents();
		return new ResponseEntity<List>(students,HttpStatus.OK);
	}
}
