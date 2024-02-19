package com.backend.wishlist.controller;

import com.backend.wishlist.entity.Wishlist;
import com.backend.wishlist.service.WishlistService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    private final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

    // to get csrf token
    @GetMapping("/csrf-token")
    public CsrfToken retrieveCsrfToken(HttpServletRequest request) {
        logger.info("The csrf token is obtained");
        return (CsrfToken) request.getAttribute("_csrf");
    }

    // for testing basic authorization
    @GetMapping("/hello-world")
    public String helloWorld(){
        logger.info("Hello World. Testing Successful");
        return "Hello World";
    }

    // GET request to get all the products present in the wishlist
    @GetMapping("/api/wishlists")
    public List<Wishlist> getAllProducts(){

        logger.info("Request received for getting all the records from wishlist entity");
        return wishlistService.fetchAllProduct();
    }

    // POST request to save product in the wishlist
    @PostMapping("/api/wishlists")
    public Wishlist saveProduct(@RequestBody Wishlist wishlist){

        logger.info("Request received for saving product");
        return wishlistService.saveProduct(wishlist);
    }

    // DELETE request to delete a product by id from wishlist
    @DeleteMapping("/api/wishlists/{id}")
    public String deleteProductById(@PathVariable("id") Integer id){

        logger.info("Request received for deleting a product by id");
        return wishlistService.deleteProductById(id);
    }
}
