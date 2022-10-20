package com.example.sahaf.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class BookInBookStore extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "book_store_id")
    private BookStore bookStore;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private int count;
}
