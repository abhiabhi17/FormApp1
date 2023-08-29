package com.example.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	

}
