package com.lojaweb.studenty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaweb.studenty.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
