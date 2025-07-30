package com.mohammed.service;

import com.mohammed.exception.ProductException;
import com.mohammed.model.Cart;
import com.mohammed.model.CartItem;
import com.mohammed.model.Product;
import com.mohammed.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
