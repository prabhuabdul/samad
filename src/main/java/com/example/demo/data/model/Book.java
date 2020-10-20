package com.example.demo.data.model;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(message = "Please provide id")
    private Long id;
    @NotEmpty(message = "Please provide title")
    private String title;
    @Column(unique = true)
    @NotEmpty(message = "Please provide isbn")
    private String isbn;
}