package com.example.postgresqldemo.postgresqldemo.service;

import com.example.postgresqldemo.postgresqldemo.dao.BookRepository;
import com.example.postgresqldemo.postgresqldemo.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookService {

  private final BookRepository bookRepository;

  public void saveBook(Book book) {
    bookRepository.save(book);
  }
}
