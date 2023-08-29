package com.example.pojo;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	private Long phno;
     
	@ElementCollection
	@CollectionTable(joinColumns=@JoinColumn(name="id"))
  
	private List<String> gender;

	@ElementCollection
	 @CollectionTable( joinColumns = @JoinColumn(name = "id"))
	private List<String> qualification;
	
	@ElementCollection
	 @CollectionTable( joinColumns = @JoinColumn(name = "id"))
	
	private List<String> courses;
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
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	public List<String> getQualification() {
		return qualification;
	}
	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phno=" + phno + ", gender=" + gender + ", qualification="
				+ qualification + ", courses=" + courses + "]";
	}
}
	
