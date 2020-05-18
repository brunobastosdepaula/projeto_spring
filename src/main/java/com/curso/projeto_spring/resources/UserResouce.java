package com.curso.projeto_spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.projeto_spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Bruno Bastos", "bruno@gmail.com", "27429128", "123456");
		return ResponseEntity.ok().body(user);
	}
}
