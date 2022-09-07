package com.bilge.booksbe.controller;

import com.bilge.booksbe.entity.Book;
import com.bilge.booksbe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(path="/all")
    public Iterable<Book> getAllUsers() {
        // This returns a JSON or XML with the users
        return bookService.getBooks();
    }
}
