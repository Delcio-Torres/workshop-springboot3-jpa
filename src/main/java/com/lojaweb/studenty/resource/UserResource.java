package com.lojaweb.studenty.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaweb.studenty.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping
	public ResponseEntity<User> findAllEntity(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
