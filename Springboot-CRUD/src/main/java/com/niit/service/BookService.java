package com.niit.service;

import java.util.List;

import com.niit.model.Book;

public interface BookService {

	List<Book> getAllBooks();
	Book getBookByID(int bookID);
	boolean addNewBook(Book book);
	boolean updateBook(Book book);
	boolean deleteBook(int bookID);
}
