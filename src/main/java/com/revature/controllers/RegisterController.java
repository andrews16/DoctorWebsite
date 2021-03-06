package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.services.RegisterService;

@RestController
@RequestMapping("rg")
public class RegisterController {
		
	RegisterService registerService;
	
	@Autowired
	public RegisterController(RegisterService registerService) {
		super();
		this.registerService = registerService;
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User rg) {
		return this.registerService.create(rg);
	}
}
