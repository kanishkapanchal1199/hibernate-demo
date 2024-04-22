package com.mappings.hibernatedemo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	private String pId;
	private String productName;
	
	@ManyToMany
	private List<Category> categories;
	
	
	
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Product() {
		
	}
	public Product(String pId, String productName) {
		
		this.pId = pId;
		this.productName = productName;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
