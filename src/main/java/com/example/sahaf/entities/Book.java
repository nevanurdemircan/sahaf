package com.example.sahaf.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book extends BaseEntity {
    private String name;

    private String author;
}
