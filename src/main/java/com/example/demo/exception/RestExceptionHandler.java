package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
@Component
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    //other exception handlers

    @ExceptionHandler(PersonNotFoundException.class)
    protected ResponseEntity<ApiError> handleEntityNotFound(
            PersonNotFoundException ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND,ex.getMessage(),ex);
        System.out.println("error");
        return new ResponseEntity(apiError,HttpStatus.NOT_FOUND);
    }
}