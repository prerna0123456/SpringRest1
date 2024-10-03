package com.example.REST1.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String body="Hello! Welcome back Aliens";
		return body;
	}
	
	@GetMapping("/welcome2")
	public String getResponse1(@RequestParam(value="name",required=false, defaultValue = "Prerna") String name) { //no Bad request if value is not passed because required is false
		String body="Hello "+name+"! Welcome back Aliens";
		return body;
	}
	
	@GetMapping("/welcome3/{name}")
	public String getResponse2(@PathVariable(value="name",required=false) String name) { //no Bad request if value is not passed because required is false
		String body="Hello "+name+"! Welcome back Aliens";
		return body;
	}


}
