package com.springboot.springbootapp.controllor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppControllor {
	@GetMapping(value="/getdata")
	public String getData() {
		return"<h1> Welcome to my page </h1>";
		
	}

}
