package com.springcrud.demo;

import com.springcrud.demo.model.Books;
import com.springcrud.demo.repository.BookRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository bookRepository){
		return args -> {
			bookRepository.deleteAll();

			Books b = new Books();
			b.setNome("Harry Potter");
			b.setCategory("Fantasia");
			b.setAutor("J. K. Rowling");

			bookRepository.save(b);
		};
	}

}
