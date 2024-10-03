package com.example.REST1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST1.controller.pojo.Aliens;

@RestController
@RequestMapping("/api")
public class AliensController {

	@GetMapping("/getalien")
	public Aliens getResponse() {
		Aliens a1=new Aliens();
		a1.setId(11);
		a1.setCity("Prosper");
		a1.setName("Prerna");
		return a1;
	}
}
