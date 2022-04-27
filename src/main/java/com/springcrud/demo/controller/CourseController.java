package com.springcrud.demo.controller;

import java.util.List;

import com.springcrud.demo.model.Books;
import com.springcrud.demo.repository.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/book")
@AllArgsConstructor
public class CourseController {

   
    private final BookRepository bookRepository;
    
    @GetMapping
    public List<Books> list(){
        return bookRepository.findAll();
    }



}
