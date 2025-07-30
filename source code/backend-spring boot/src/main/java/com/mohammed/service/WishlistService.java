package com.mohammed.service;


import com.mohammed.exception.WishlistNotFoundException;
import com.mohammed.model.Product;
import com.mohammed.model.User;
import com.mohammed.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

