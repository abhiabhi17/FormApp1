package com.example.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl  implements StudentDao{

	@Override
	public List<String> getCourses() {
		// TODO Auto-generated method stub
		
		List<String> courses=new ArrayList<String>();
		courses.add("Java");
		courses.add("Hibernate");
		return courses;
	}

	@Override
	public List<String> getQualifications() {
		
		List<String> qualifications=new ArrayList<String>();
		qualifications.add("Graduate");
		qualifications.add("PostGraduate");
		return qualifications;
	}

	@Override
	public List<String> getGenders() {
		
		List<String> genders=new ArrayList<String>();
		genders.add("Male");
		genders.add("Female");
		return genders;
	}

}
