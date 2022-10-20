package com.example.sahaf.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "book-stores")
public class BookStore extends BaseEntity {
    private String name;

    private String phoneNumber;

    @OneToMany(mappedBy = "book")

    private List<BookInBookStore> bookInBookStores;

    @OneToMany(mappedBy = "bookStore")
    private List<RentedBook> rentedBooks;
}
