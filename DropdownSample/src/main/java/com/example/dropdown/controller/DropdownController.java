package com.example.dropdown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DropdownController {
	
	public DropdownController() {
		
	}
	
	@GetMapping("/")
	public String initialize() {
	//test
		return "calendar.scala";
	}
	
}
