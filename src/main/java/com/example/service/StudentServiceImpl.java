package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.StudentDao;
import com.example.jpa.StudentRepository;
import com.example.pojo.Student;

@Service
public class StudentServiceImpl  implements StudentService{
	  @Autowired
	    private StudentRepository repo;
	
	@Autowired(required=true)
	private StudentDao dao;

	@Override
	public List<String> getGenders() {
		// TODO Auto-generated method stub
		return dao.getGenders();
	}

	@Override
	public List<String> getQualifications() {
		// TODO Auto-generated method stub
		return dao.getQualifications();
	}

	@Override
	public List<String> getCourses() {
		// TODO Auto-generated method stub
		return dao.getCourses();
	}

	@Override
	public void save(Student s) {
		
	 repo.save(s);
	}

	
}
