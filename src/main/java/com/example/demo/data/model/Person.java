package com.example.demo.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Component
@Setter
@Getter
public class Person {
        @NotNull(message = "Please provide age")
        private Integer age;
        @NotEmpty(message = "Please provide firstname")
        private String firstName;
        @NotEmpty(message = "Please provide lastname")
        private String lastName;


}
