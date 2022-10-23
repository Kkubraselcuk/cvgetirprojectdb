package com.cvproject.cvproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvproject.cvproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
