package com.mohammed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
