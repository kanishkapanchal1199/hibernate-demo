package com.mappings.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.hibernatedemo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String	>{

}
