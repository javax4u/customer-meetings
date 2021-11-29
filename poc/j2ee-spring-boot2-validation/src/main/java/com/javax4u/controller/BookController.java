package com.javax4u.controller;

import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javax4u.controller.repositorty.BookRepository;

/** 
 * TODO 3. add orElseThrow on line 27
 * @author rupesh kumar
 *
 */
@RestController
@Validated
public class BookController {

	@Autowired
	private BookRepository repository;
	
	//find
	@GetMapping("/books")
	List<Book> findAll(){
		return repository.findAll();
	}
	
	//save
	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	Book newBook(@Valid @RequestBody Book newBook) {
		return repository.save(newBook);
	}
	
	@GetMapping("/books/{bookId}")
	Book findOne(@PathVariable @Min(1) Long bookId) {
		return repository.findById(bookId);
	}
}
