package com.example.sahaf.entities;

;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String name;

    private String surname;

    private String phoneNumber;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<RentedBook> rentedBooks;

}
