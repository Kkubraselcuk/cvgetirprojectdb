package com.cvproject.cvproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cvproject.cvproject.entities.Manager;
import com.cvproject.cvproject.repos.ManagerRepository;

@Service
public class ManagerService {
	private ManagerRepository managerRepository;

	public ManagerService(ManagerRepository managerRepository) {

		this.managerRepository = managerRepository	;
	}

	public List<Manager> getAllManagers() {
		return managerRepository.findAll();
	}

	public Manager getOneManager(Long managerId) {
		return managerRepository.findById(managerId).orElse(null);
	}
}
