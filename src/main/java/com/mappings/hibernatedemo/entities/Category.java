package com.mappings.hibernatedemo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="category")
public class Category {
	
	@Id
	private String cid;
	private String title;
	
	@ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
	private List<Product> product=new ArrayList<>();
	
	
	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public Category() {
	}
	
	
	public Category(String cid, String title) {
		this.cid = cid;
		this.title = title;
	}


	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
