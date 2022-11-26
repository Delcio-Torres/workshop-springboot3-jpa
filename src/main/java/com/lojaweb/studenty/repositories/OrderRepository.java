package com.lojaweb.studenty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaweb.studenty.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
