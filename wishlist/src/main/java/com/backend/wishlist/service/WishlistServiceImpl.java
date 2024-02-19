package com.backend.wishlist.service;

import com.backend.wishlist.entity.Wishlist;
import com.backend.wishlist.repository.WishlistRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class WishlistServiceImpl implements WishlistService{

    @Autowired
    private WishlistRepository wishlistRepository;

    private final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

    // save product in wishlist
    @Override
    public Wishlist saveProduct(Wishlist wishlist) {

        logger.info("Added new product in the wishlist");
        return wishlistRepository.save(wishlist);
    }

    // get all the products in wishlist
    @Override
    public List<Wishlist> fetchAllProduct(){

        logger.info("Found all the products present in the wishlist");
        return wishlistRepository.findAll();
    }

    // delete a product by id present in the wishlist
    @Override
    public String deleteProductById(Integer Id){

        logger.info("Deleted product from wishlist");

        if(wishlistRepository.findById(Id).isPresent()){
            wishlistRepository.deleteById(Id);
            return "Product with the given product_id is successfully deleted from wishlist";
        }
        return "No product found in wishlist";
    }
}
