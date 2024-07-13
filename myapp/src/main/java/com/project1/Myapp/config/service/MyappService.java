package com.project1.Myapp.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.myapp.bean.Books;

@Service
public class MyappService {
    private final Books book;

    @Autowired
    public MyappService(Books book) {
        this.book = book;
    }

    public String Display() {
        return "spring in action";
    }

    public void addBooks(String addbooks) {
        book.addBooks(addbooks);
    }

    public List<String> getBookDetails() {
        return book.getBooks();
    }
}


