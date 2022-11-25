package com.lojaweb.studenty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaweb.studenty.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
