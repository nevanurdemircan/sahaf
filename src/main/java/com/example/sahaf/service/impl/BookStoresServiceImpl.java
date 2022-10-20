package com.example.sahaf.service.impl;

import com.example.sahaf.entities.BookStore;
import com.example.sahaf.repository.BookStoresRepository;
import com.example.sahaf.service.BookStoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookStoresServiceImpl implements BookStoresService {

    private final BookStoresRepository bookStoresRepository;

    @Override
    public BookStore save(BookStore bookStore) {
        return bookStoresRepository.save(bookStore);
    }

    @Override
    public BookStore update(BookStore bookStore, int id) {
        BookStore willBeUpdated = bookStoresRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        willBeUpdated.setName(bookStore.getName());
        willBeUpdated.setPhoneNumber(bookStore.getPhoneNumber());
        return bookStoresRepository.save(bookStore);
    }

    @Override
    public String delete(int id) {
        Optional<BookStore> bookStoresOptional = bookStoresRepository.findById(id);
        if(bookStoresOptional.isPresent()){
            return "başarılı";
        }else{
            return "id yanlış";
        }
    }

    @Override
    public List<BookStore> getAll() {
        return bookStoresRepository.findAll();
    }
}
