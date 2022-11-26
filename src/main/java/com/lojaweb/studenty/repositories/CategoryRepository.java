package com.lojaweb.studenty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaweb.studenty.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
