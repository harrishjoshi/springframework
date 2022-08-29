package com.harxsh.springboot.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping("")
    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book(1, "Spring Boot", "Harish"),
            new Book(2, "Spring Boot 2", "Joshi")
        );
    }
}
