package com.adminmicroservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

	
	@GetMapping("/")
	public String welcomeApi() {
		return "Welcome to National Informatics Center Kolkta";
		
	}
}
