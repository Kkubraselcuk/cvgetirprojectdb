package com.cvproject.cvproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cvproject.cvproject.entities.UserDetailList;
import com.cvproject.cvproject.services.UserDetailListService;

@RestController
@RequestMapping("/userdetaillist")
@CrossOrigin("http://localhost:3000/")
public class UserDetailListController {
	private UserDetailListService userDetailListService;
	
	public UserDetailListController(UserDetailListService userDetailListService) {
		this.userDetailListService = userDetailListService;
	}
	
	@GetMapping
	public List<UserDetailList> getAllUserDetailList(){
		return userDetailListService.getAllUserDetailList();
	}
	
	@GetMapping("/{userId}")
	public UserDetailList getOneUserDetailList(@PathVariable Long userId){
		return userDetailListService.getOneUserDetailList(userId);
	}
	
	@PutMapping("/{userId}")
	public UserDetailList updateOneUserDetailList(@PathVariable Long userId, @RequestBody UserDetailList newUser){
		return userDetailListService.updateOneUserDetailList(userId, newUser);
	}
	
	@CrossOrigin("http://localhost:3000/")
	@PostMapping
	public UserDetailList createUsers(@RequestBody UserDetailList newUser){
		return userDetailListService.saveOneUserDetailList(newUser);
	}
}
