package com.example.library;

public class BookDAO extends GenericDAO<Book, Long> {
    public BookDAO() {
        super(Book.class);
    }
}

