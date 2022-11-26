package com.lojaweb.studenty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaweb.studenty.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
