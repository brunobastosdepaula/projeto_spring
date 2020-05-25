package com.curso.projeto_spring.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
