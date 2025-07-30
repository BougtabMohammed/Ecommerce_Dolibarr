package com.mohammed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
