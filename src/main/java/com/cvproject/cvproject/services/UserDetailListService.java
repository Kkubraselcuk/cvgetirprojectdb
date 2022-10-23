package com.cvproject.cvproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cvproject.cvproject.entities.UserDetailList;
import com.cvproject.cvproject.repos.UserDetailListRepository;

@Service
public class UserDetailListService {
	private UserDetailListRepository userDetailListRepository;
	
	public UserDetailListService(UserDetailListRepository userDetailListRepository) {
		this.userDetailListRepository = userDetailListRepository;
	}
	
	public List<UserDetailList> getAllUserDetailList() {
		return userDetailListRepository.findAll();
	}
	
	public UserDetailList getOneUserDetailList(Long userId) {
		return userDetailListRepository.findById(userId).orElse(null);
	}
	
	public UserDetailList saveOneUserDetailList(UserDetailList newUser) {
		return userDetailListRepository.save(newUser);
	}
	
	public UserDetailList updateOneUserDetailList(Long userId, UserDetailList newUser) {
		Optional<UserDetailList> user = userDetailListRepository.findById(userId);
		if(user.isPresent()) {
			UserDetailList foundUser = user.get();
			foundUser.setName(newUser.getName());
			foundUser.setSurname(newUser.getSurname());
			foundUser.setPhoneNumber(newUser.getPhoneNumber());
			foundUser.seteMail(newUser.geteMail());
			foundUser.setUniversity(newUser.getUniversity());
			foundUser.setUniversityDepartment(newUser.getUniversityDepartment());
			foundUser.setWork(newUser.getWork());
			foundUser.setWorkDate(newUser.getWorkDate());
			foundUser.setWorkComment(newUser.getWorkComment());
			foundUser.setProfessionalSkill(newUser.getProfessionalSkill());
			userDetailListRepository.save(foundUser);
			return foundUser;
		}else {
			return null;
		}
	}
}
