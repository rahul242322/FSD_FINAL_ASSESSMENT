package com.FinalProject.finalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalProject.finalProject.entity.Book;
import com.FinalProject.finalProject.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public List<Book> fetchAllBooks(){
		
		return bookRepository.findAll();
	}
	
	public Book create(Book book) {
		
		return bookRepository.save(book);
		
	}
	
	
	

}
