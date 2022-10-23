package com.cvproject.cvproject.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cvproject.cvproject.entities.Manager;
import com.cvproject.cvproject.services.ManagerService;

@RestController
@RequestMapping("/managers")
@CrossOrigin("http://localhost:3000/")
public class ManagerController {
	private ManagerService managerService;
	public ManagerController(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	@GetMapping
	public List<Manager> getAllManagers(){
		return managerService.getAllManagers();
	}
	@GetMapping("/{managerId}")
	public Manager getOneManager(@PathVariable Long managerId){
		return managerService.getOneManager(managerId);
	}
}
