package com.curso.projeto_spring.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto_spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
