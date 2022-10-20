package com.example.sahaf.service;

import com.example.sahaf.entities.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    Book update(Book book, int id);

    String delete(int id);

    List<Book> getAll();

    Book getById(int id);
}
