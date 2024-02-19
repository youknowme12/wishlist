package com.backend.wishlist.service;

import com.backend.wishlist.entity.Wishlist;
import com.backend.wishlist.repository.WishlistRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class WishlistServiceImpl implements WishlistService{

    @Autowired
    private WishlistRepository wishlistRepository;


    // save product in wishlist
    @Override
    public Wishlist saveProduct(Wishlist wishlist) {

        return wishlistRepository.save(wishlist);
    }

    // get all the products in wishlist
    @Override
    public List<Wishlist> fetchAllProduct(){

        return wishlistRepository.findAll();
    }

    // delete a product by id present in the wishlist
    @Override
    public String deleteProductById(Integer Id){

        if(wishlistRepository.findById(Id).isPresent()){
            wishlistRepository.deleteById(Id);
            return "Product with the given product_id is successfully deleted from wishlist";
        }
        return "No product found in wishlist";
    }
}
