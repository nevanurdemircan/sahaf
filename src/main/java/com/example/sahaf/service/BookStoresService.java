package com.example.sahaf.service;

import com.example.sahaf.entities.BookStore;

import java.util.List;

public interface BookStoresService {
    BookStore save(BookStore bookStore);

    BookStore update(BookStore bookStore, int id);

    String delete(int id);

    List<BookStore> getAll();
}
