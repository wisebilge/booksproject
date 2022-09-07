package com.bilge.booksbe.service;

import com.bilge.booksbe.entity.Book;
import com.bilge.booksbe.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }
}
