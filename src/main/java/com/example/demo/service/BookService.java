package com.example.demo.service;

import com.example.demo.data.model.Book;
import com.example.demo.data.model.Person;
import com.example.demo.exception.PersonNotFoundException;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    List<Book> per_lst = new ArrayList();

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBookList(String title){
        if(!title.equals("jam")){
throw new PersonNotFoundException("item not found");

        }
        return bookRepository.findByTitleContaining(title);
    }

}
