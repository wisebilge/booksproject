package com.bilge.booksbe.controller;

import com.bilge.booksbe.entity.Book;
import com.bilge.booksbe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.rmi.ServerException;
import java.util.Iterator;


@RestController
@RequestMapping(path="/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(path = "/all")
    public Iterable<Book> getAll() {
        return bookService.getBooks();
    }

    @PostMapping(path= "/add")
    public ResponseEntity<Book> add(@RequestBody Book newBook) {
            Book persistedBook = bookService.save(newBook);
            return ResponseEntity
                    .created(URI
                            .create(String.format("/books", newBook.getName())))
                    .body(persistedBook);
        }
    }







