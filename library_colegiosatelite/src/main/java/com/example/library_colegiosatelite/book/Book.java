package com.example.library_colegiosatelite.book;

import jakarta.persistence.*;

@Table(name = "books")
@Entity(name = "books")
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // é a Primary Key
    private Long id;
    private String title, gender, author, dataRelease, coverImg;
    private Integer pages, classification;
}
