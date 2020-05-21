package com.curso.projeto_spring.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
