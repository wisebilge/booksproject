package com.bilge.booksbe.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
}
