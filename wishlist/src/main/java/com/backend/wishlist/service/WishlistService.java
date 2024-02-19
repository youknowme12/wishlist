package com.backend.wishlist.service;

import com.backend.wishlist.entity.Wishlist;

import java.util.List;

public interface WishlistService {

        Wishlist saveProduct(Wishlist wishlist);
        List<Wishlist> fetchAllProduct();
        String deleteProductById(Integer id);
}
