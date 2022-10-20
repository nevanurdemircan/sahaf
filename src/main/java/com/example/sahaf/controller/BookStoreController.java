package com.example.sahaf.controller;

import com.example.sahaf.entities.BookStore;
import com.example.sahaf.service.BookStoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book-store")
public class BookStoreController {

    private final BookStoresService bookStoresService;

    @PostMapping("save")
    public BookStore save(@RequestBody BookStore bookStore) {
        return bookStoresService.save(bookStore);
    }
    @PutMapping("{id}")
    public BookStore update(@RequestBody BookStore bookStore, @PathVariable int id){
        return bookStoresService.update(bookStore,id);
    }
    @GetMapping("delete")
    public String delete(@RequestParam int id){
        return bookStoresService.delete(id);
    }
    @GetMapping("all")
    public List<BookStore> getAll(){
        return bookStoresService.getAll();
    }
}
