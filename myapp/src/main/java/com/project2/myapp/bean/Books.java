package com.project2.myapp.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Books {
    private final List<String> books = new ArrayList<>();

    public void addBooks(String book) {
        books.add(book);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}

