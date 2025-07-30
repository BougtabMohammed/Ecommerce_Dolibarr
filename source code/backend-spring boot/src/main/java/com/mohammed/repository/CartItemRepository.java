package com.mohammed.repository;

import com.mohammed.model.Cart;
import com.mohammed.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
