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

    private static String name;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
