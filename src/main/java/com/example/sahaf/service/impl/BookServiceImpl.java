package com.example.sahaf.service.impl;

import com.example.sahaf.entities.Book;
import com.example.sahaf.repository.BookRepository;
import com.example.sahaf.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book, int id) {
        Book willBeUpdated = bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        willBeUpdated.setName(book.getName());
        willBeUpdated.setAuthor(book.getAuthor());
        return bookRepository.save(book);
    }

    @Override
    public String delete(int id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if(bookOptional.isPresent()){
            return "başarılı";
        }else{
            return "id yanlış";
        }
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(int id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        return bookOptional.get();

    }
}
