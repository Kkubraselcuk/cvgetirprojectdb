package com.cvproject.cvproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user_detail_list")
@Data
public class UserDetailList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String surname;
	String phoneNumber;
	String eMail;
	String university;
	String universityDepartment;
	String work;
	String workDate;
	String workComment;
	String professionalSkill;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getUniversityDepartment() {
		return universityDepartment;
	}
	public void setUniversityDepartment(String universityDepartment) {
		this.universityDepartment = universityDepartment;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getWorkComment() {
		return workComment;
	}
	public void setWorkComment(String workComment) {
		this.workComment = workComment;
	}
	public String getProfessionalSkill() {
		return professionalSkill;
	}
	public void setProfessionalSkill(String professionalSkill) {
		this.professionalSkill = professionalSkill;
	}
	
	
}
