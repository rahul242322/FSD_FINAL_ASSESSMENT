package com.FinalProject.finalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FinalProject.finalProject.beans.GlobalResponseHandler;
import com.FinalProject.finalProject.entity.Book;
import com.FinalProject.finalProject.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/book")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping
	public ResponseEntity<Object> getAllBooks() {

		return GlobalResponseHandler.createResponse("Fecthed All Repsonse Sucessfully", bookService.fetchAllBooks(),
				HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> saveBook(@RequestBody Book book) {

		return GlobalResponseHandler.createResponse("Book is saved in DB successfully", bookService.create(book),
				HttpStatus.CREATED);

	}

}
