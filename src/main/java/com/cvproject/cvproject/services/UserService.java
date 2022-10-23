package com.cvproject.cvproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cvproject.cvproject.entities.User;
import com.cvproject.cvproject.repos.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {

		this.userRepository = userRepository	;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getOneUser(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	
	 public User saveOneUser(User newUser) {
		return userRepository.save(newUser);
	}
	 /*
	 public User updateOneUser(Long userId, User newUser) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser = user.get();
			foundUser.setUserTc(newUser.getUserTc());
			foundUser.setName(newUser.getName());
			foundUser.setLastName(newUser.getLastName());
			foundUser.setPhoneNumber(newUser.getPhoneNumber());
			foundUser.seteMail(newUser.geteMail());
			userRepository.save(foundUser);
			return foundUser;
		}else {
			return null;
		}
	}
	public void deleteOneUser(Long userId) {
		userRepository.deleteById(userId);
		
	}
	*/
	
	
}
