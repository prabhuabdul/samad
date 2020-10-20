package com.example.demo;

import com.example.demo.data.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

            Book bk = new Book();
            bk.setTitle("jam");
            bk.setIsbn("jammer");

            Book bk1 = new Book();
            bk1.setTitle("oath");
            bk1.setIsbn("oather");

            Book bk2 = new Book();
            bk2.setTitle("nov");
            bk2.setIsbn("nover");

            bookRepository.save(bk);
            bookRepository.save(bk1);
            bookRepository.save(bk2);

            }
}
