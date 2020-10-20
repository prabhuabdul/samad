package com.example.demo.repository;

import com.example.demo.data.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);

    @Query("SELECT u FROM Book u WHERE u.title = :title")
    List<Book> findByTitleContaining(@Param("title")  String title);
}