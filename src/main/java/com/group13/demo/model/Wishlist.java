package com.group13.demo.model;
import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "wishlists")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wishlistId;

    @Column(nullable = false)
    private int userId;

    @OneToMany(mappedBy = "wishlist", cascade = CascadeType.ALL)
    private List<Product> products;
}
