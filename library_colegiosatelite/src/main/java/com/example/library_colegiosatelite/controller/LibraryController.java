package com.example.library_colegiosatelite.controller;

import com.example.library_colegiosatelite.book.Book;
import com.example.library_colegiosatelite.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("book")
public class LibraryController {
    @Autowired // injeta as dependências do SpringBoot automaticamente
    private BookRepository repository;

    @GetMapping()
    public List<Book> getAll(){
        List<Book> bookList = repository.findAll(); //vai requisitar todos os dados da tabela books
        return bookList;
    }
}
