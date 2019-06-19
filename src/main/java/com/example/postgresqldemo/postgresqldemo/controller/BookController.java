package com.example.postgresqldemo.postgresqldemo.controller;

import com.example.postgresqldemo.postgresqldemo.entity.Book;
import com.example.postgresqldemo.postgresqldemo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

  private final BookService bookService;

  @PostMapping
  public String saveBook(Book book) {
    bookService.saveBook(book);
    return "SUCCESS";
  }
}
