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

    //deneme
   /* @PostMapping("/enter")
    public String enter(@RequestBody String bookName) {
       return bookName;
   }*/

    //deneme2
    @PostMapping(path= "/add",
    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Iterable<Book> create(@RequestBody Book newBook)
    {
        Book persistedBook = bookService.save(newBook);
        return (Iterable<Book>) ResponseEntity
                .created(URI
                        .create(String.format("/books", Book.getName())))
                .body(persistedBook);
            };
        }







