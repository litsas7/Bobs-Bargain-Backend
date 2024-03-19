package com.group13.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ElementCollection
    @Column(columnDefinition = "jsonb")
    private List<String> cart;

    @ElementCollection
    @Column(columnDefinition = "jsonb")
    private List<String> wishlist;

    @ElementCollection
    @Column(columnDefinition = "jsonb")
    private List<String> orderHistory;
}
