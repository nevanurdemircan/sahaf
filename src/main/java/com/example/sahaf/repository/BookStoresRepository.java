package com.example.sahaf.repository;

import com.example.sahaf.entities.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoresRepository extends JpaRepository<BookStore,Integer> {
}
