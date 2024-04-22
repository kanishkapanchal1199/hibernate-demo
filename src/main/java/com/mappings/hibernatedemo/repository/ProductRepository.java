package com.mappings.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappings.hibernatedemo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,String>{

}
