package com.example.demo.controller;
import com.example.demo.data.model.Book;
import com.example.demo.data.model.Person;
import com.example.demo.exception.FormValidator;
import com.example.demo.service.BookService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/info")
public class MyController  extends FormValidator {

    @Autowired
    PersonService personService;

    @Autowired
    BookService bookService;

    @GetMapping(value="/person")
    public ResponseEntity<List<Person>> index() {
       List<Person> lst = personService.getPersonList();
        return new ResponseEntity(lst, HttpStatus.OK);
    }

    @PostMapping("/postPerson")
    public ResponseEntity<String> newBook(@Valid @RequestBody Person newBook) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value="/book/{title}")
    public ResponseEntity<List<Book>> getBook(@PathVariable String title) {
        List<Book> lst = bookService.getBookList(title);
        return new ResponseEntity(lst, HttpStatus.OK);
    }


    
}