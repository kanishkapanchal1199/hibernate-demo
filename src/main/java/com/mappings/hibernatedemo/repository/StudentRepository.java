package com.mappings.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.hibernatedemo.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	
}
