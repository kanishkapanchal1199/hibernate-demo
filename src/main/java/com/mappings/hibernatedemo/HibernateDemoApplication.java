package com.mappings.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mappings.hibernatedemo.entities.Address;
import com.mappings.hibernatedemo.entities.Category;
import com.mappings.hibernatedemo.entities.Laptop;
import com.mappings.hibernatedemo.entities.Product;
import com.mappings.hibernatedemo.entities.Student;
import com.mappings.hibernatedemo.repository.CategoryRepository;
import com.mappings.hibernatedemo.repository.ProductRepository;
import com.mappings.hibernatedemo.repository.StudentRepository;

import lombok.extern.log4j.Log4j;

@SpringBootApplication
public class HibernateDemoApplication {

	
	
	private static StudentRepository studentRepository;
	
	private static CategoryRepository categoryRepository;
	
	private static ProductRepository productRepository;
	
	
	@Autowired
	public HibernateDemoApplication(StudentRepository studentRepository, ProductRepository productRepository,CategoryRepository categoryRepository)
	{
		this.studentRepository=studentRepository;
		this.categoryRepository=categoryRepository;
		this.productRepository=productRepository;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
		
		Student student=new Student();
		student.setStudentName("kanishka");
		student.setAbout("I am a Software Engineer");
		student.setStudentId(1);
		
//		Laptop laptop=new Laptop();
//		laptop.setModelNumber("1234");
//		laptop.setLaptopId(12);
//		laptop.setBrand("Samsung");
//		laptop.setStudent(student);
//	
//		student.setLaptop(laptop);
//		
//		
//	Student save=studentRepository.save(student);
//			System.out.println(save);
//			
//			
//	Student student2=studentRepository.findById(1).get();
//	
//	System.out.println("Laptop brand: "+ student2.getLaptop().getBrand());
		
//		Address address=new Address();
//		address.setAddressId(1);
//		address.setCity("Ahmedabad");
//		address.setCountry("India");
//		address.setStreet("Ahmedabad");
//		address.setStudent(student);
//		
//		
//		Address address1=new Address();
//		address.setAddressId(2);
//		address.setCity("Pune");
//		address.setCountry("India");
//		address.setStreet("Pune");
//		address.setStudent(student);
//		
//		List<Address> listOfAddress=new ArrayList<>();
//		
//		listOfAddress.add(address);
//		listOfAddress.add(address1);
//		
//		student.setAddress(listOfAddress);
//		
//		Student save=studentRepository.save(student);
//		System.out.println("Student created with address : "+ save);
		
		Product p1=new Product();
		p1.setpId("1");
		p1.setProductName("iphone");
		
		Product p2=new Product();
		p2.setpId("2");
		p2.setProductName("samsung");
		
		Product p3=new Product();
		p3.setpId("3");
		p3.setProductName("OPPO");
		
		Category category=new Category();
		category.setCid("1");
		category.setTitle("Mobiles");
		
		Category category1=new Category();
		category1.setCid("2");
		category1.setTitle("Electronics");
		
		List<Product> listOfProducts=category1.getProduct();
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		
		
		List<Product> listOfProducts1=category.getProduct();
		listOfProducts1.add(p3);
	
		
		categoryRepository.save(category);
		categoryRepository.save(category1);
		
		
			
		
		
	}

}
