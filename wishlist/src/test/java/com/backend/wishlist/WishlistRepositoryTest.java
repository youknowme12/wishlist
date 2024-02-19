package com.backend.wishlist;

import com.backend.wishlist.entity.Wishlist;
import com.backend.wishlist.repository.WishlistRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WishlistRepositoryTest {

    @Autowired
    private WishlistRepository wishlistRepository;

    /*@Test
    @Order(1)
    @Rollback(value = false)
    public void saveProductTest() {
        Wishlist wishlist =
    }*/

}
