package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.model.Book;
import com.niit.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/allBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> allBooks = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(allBooks, HttpStatus.OK);
	}
	
	@GetMapping("/getBookByID/{bookID}")
	public ResponseEntity<Book> getBookByID(@PathVariable("bookID") int bookID)
	{
		Book book = bookService.getBookByID(bookID);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addNewBook(@RequestBody Book book)
	{
		boolean result = bookService.addNewBook(book);
		if(result)
		{
			return new ResponseEntity<String>("Book details inserted in database",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Error While inserting Book!! Check Console for further updates...",HttpStatus.NOT_IMPLEMENTED);
		}
	}
	
	@PutMapping("/updateBook")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		boolean result = bookService.updateBook(book);
		if(result)
		{
			return new ResponseEntity<String>("Book details updated in database",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Error While updating Book!! Check Console for further updates...",HttpStatus.NOT_IMPLEMENTED);
		}
	}
	
	@DeleteMapping("/deleteBook/{bookID}")
	public ResponseEntity<String> updateBook(@PathVariable("bookID") int bookID)
	{
		boolean result = bookService.deleteBook(bookID);
		if(result)
		{
			return new ResponseEntity<String>("Book details deleted in database",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Error While deleting Book!! Check Console for further updates...",HttpStatus.NOT_IMPLEMENTED);
		}
	}
}
