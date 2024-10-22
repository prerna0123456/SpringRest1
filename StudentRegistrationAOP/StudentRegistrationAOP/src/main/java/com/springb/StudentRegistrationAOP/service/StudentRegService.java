package com.springb.StudentRegistrationAOP.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springb.StudentRegistrationAOP.dao.Student;
import com.springb.StudentRegistrationAOP.dao.iStudentRepo;

@Service
public class StudentRegService {
	
	@Autowired
	iStudentRepo repo;
	
	public Student registerStudent(Student s){
		repo.save(s);
		return s;
	}
	
	public Student getStudentbyID(Integer id) throws Exception {
		
		Optional<Student> result = repo.findById(id);
		if(result.isEmpty()) {
			throw new Exception("No student with such id Present. Please re enter correct id");
		}
		else {
		Student s=result.get();
		return s;
		}
		
	}
	
	public List<Student> getAllStudents(){
		List<Student> list = repo.findAll();
		

		return list ;
	}


}
