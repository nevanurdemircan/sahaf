package com.example.sahaf.service;

import com.example.sahaf.entities.Book;
import com.example.sahaf.entities.User;


import java.util.List;

public interface UserService {
    User save(User user);

    User update(User user, int id);

    String delete(int id);

    List<User> getAll();
}
