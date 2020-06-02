package com.curso.projeto_spring.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.projeto_spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
