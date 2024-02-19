package com.backend.wishlist.controller;

import com.backend.wishlist.entity.Wishlist;
import com.backend.wishlist.service.WishlistService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    // to get csrf token
    @GetMapping("/csrf-token")
    public CsrfToken retrieveCsrfToken(HttpServletRequest request) {

        return (CsrfToken) request.getAttribute("_csrf");
    }

    // for testing basic authorization
    @GetMapping("/hello-world")
    public String helloWorld(){

        return "Hello World";
    }

    // GET request to get all the products present in the wishlist
    @GetMapping("/api/wishlists")
    public List<Wishlist> getAllProducts(){

        return wishlistService.fetchAllProduct();
    }

    // POST request to save product in the wishlist
    @PostMapping("/api/wishlists")
    public Wishlist saveProduct(@RequestBody Wishlist wishlist){

        return wishlistService.saveProduct(wishlist);
    }

    // DELETE request to delete a product by id from wishlist
    @DeleteMapping("/api/wishlists/{id}")
    public String deleteProductById(@PathVariable("id") Integer id){

        return wishlistService.deleteProductById(id);
    }
}
