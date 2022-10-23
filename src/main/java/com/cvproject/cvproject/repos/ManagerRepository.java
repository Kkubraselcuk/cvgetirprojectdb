package com.cvproject.cvproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvproject.cvproject.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

}
