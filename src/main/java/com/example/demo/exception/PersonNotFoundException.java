package com.example.demo.exception;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException(String exception) {
        super(exception);
    }

}