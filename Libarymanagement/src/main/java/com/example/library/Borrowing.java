package com.example.library;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "borrowings")
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "borrower_id", nullable = false)
    private Borrower borrower;

    @Column(name = "borrow_date", nullable = false)
    private Date borrowDate;

    @Column(name = "return_date")
    private Date returnDate;

    // Getters and Setters
}
