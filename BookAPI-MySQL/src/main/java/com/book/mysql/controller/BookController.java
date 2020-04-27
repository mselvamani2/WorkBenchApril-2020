package com.book.mysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.mysql.model.Book;
import com.book.mysql.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks()
	{
		return repository.findAll();
	}
	
	@GetMapping("/getOneBook/{id}")
	public Optional<Book> getOneBook(@PathVariable("id") int id)
	{
		return repository.findById(id);
	}
	
	@PostMapping("/createBook")
	public Book createBook(@RequestBody Book book)
	{
		return repository.save(book);
	}
	
	@DeleteMapping("/removeBook/{id}")
	public String removeBook(@PathVariable("id") Integer id)
	{
		
		repository.deleteById(id);
		return "deleted successfully";
	}
}
