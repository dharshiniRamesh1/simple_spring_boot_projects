package com.example.library;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "borrowers")
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
    private Set<Borrowing> borrowings;

    // Getters and Setters
}

