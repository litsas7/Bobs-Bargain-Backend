package com.group13.demo.controller;
import com.group13.demo.model.Wishlist;
import com.group13.demo.repository.WishlistRepository;
import com.group13.demo.responce.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlists")
public class WishlistController {
    @Autowired
    private WishlistRepository wishlistRepository;

    @GetMapping
    public List<Wishlist> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    @GetMapping("/{id}")
    public Wishlist getWishlistById(@PathVariable int id) {
        return wishlistRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Wishlist not found with id " + id));
    }

    @PostMapping
    public Wishlist createWishlist(@RequestBody Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    @PutMapping("/{id}")
    public Wishlist updateWishlist(@PathVariable int id, @RequestBody Wishlist wishlistDetails) {
        Wishlist wishlist = wishlistRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Wishlist not found with id " + id));

        // Update wishlist details here

        return wishlistRepository.save(wishlist);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlist(@PathVariable int id) {
        wishlistRepository.deleteById(id);
    }
}
