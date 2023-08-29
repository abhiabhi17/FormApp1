package com.example.service;

import java.util.List;

import com.example.pojo.Student;

public interface StudentService {

	public List<String> getGenders();

	public List<String> getQualifications();

	public List<String> getCourses();

	public void save(Student s);

	

}
