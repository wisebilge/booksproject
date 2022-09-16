package com.bilge.booksbe.controller;

import com.bilge.booksbe.entity.Book;
import com.bilge.booksbe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(path = "/all")
    public Iterable<Book> getAllUsers() {
        return bookService.getBooks();
    }

    @PostMapping("/enter")
    public String enter(@RequestBody String bookName) {
       return bookName;
   }


    }

