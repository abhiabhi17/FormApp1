package com.example.jpa;

import java.util.List;

public interface StudentDao {

	List<String> getGenders();

	List<String> getQualifications();

	List<String> getCourses();

}
