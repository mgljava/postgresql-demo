package com.example.postgresqldemo.postgresqldemo.dao;

import com.example.postgresqldemo.postgresqldemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
