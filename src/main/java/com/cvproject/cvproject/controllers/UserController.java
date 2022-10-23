package com.cvproject.cvproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cvproject.cvproject.entities.User;
import com.cvproject.cvproject.services.UserService;


@RestController
@RequestMapping("/users")
@CrossOrigin("http://localhost:3000/")
public class UserController {
	private UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public User getOneUser(@PathVariable Long userId){
		return userService.getOneUser(userId);
	}
	
	@PostMapping
	public User createUsers(@RequestBody User newUser){
		return userService.saveOneUser(newUser);
	}
	/*
	@GetMapping("/{userId}")
	public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser){
		return userService.updateOneUser(userId, newUser);
	}
	@DeleteMapping("/{userId}")
	public void deleteOneUser(@PathVariable Long userId) {
		userService.deleteOneUser(userId);
	}
*/
}
