package com.curso.projeto_spring.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
