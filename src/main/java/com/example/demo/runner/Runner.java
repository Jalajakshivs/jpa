package com.example.demo.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.save(new Product("PEN",6.8,"null"));
		repo.save(new Product("PENCIL",6.8,"ASE"));
		repo.save(new Product("Book",18,"null"));
		repo.save(new Product("BOX",68,"null"));
		repo.save(new Product("Laptop",68,"DEL"));
		
		Product p = repo.findByProdCode("ASE");  
		System.out.println(p);  
		List<Product> P1=repo.findByProdCodeIsnull();
		System.out.println(P1);
		//2
		
	/*	Optional<Product> p=repo.findById(3);
		if(p.isPresent()) {
			System.out.println(p.get());
		}
		else {
			System.out.println("No Data found");
		}
		repo.findAll().forEach((System.out::println));
		
		//repo.deleteAll();
		
		repo.deleteAllInBatch();   */
	}

}
