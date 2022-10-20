package com.example.sahaf.controller;

import com.example.sahaf.entities.Book;
import com.example.sahaf.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/save")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id) {
        return bookService.delete(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable int id) {
        return bookService.getById(id);
    }

    @PutMapping("{id}")
    public Book update(@RequestBody Book book, @PathVariable int id) {
        return bookService.update(book, id);
    }

    @GetMapping("all")
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
