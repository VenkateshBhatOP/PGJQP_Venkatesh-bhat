package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.BookDao;
import com.niit.model.Book;
import com.niit.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookByID(int bookID) {
		return bookDao.getBookByID(bookID);
	}

	@Override
	public boolean addNewBook(Book book) {
		return bookDao.addNewBook(book);
	}

	@Override
	public boolean updateBook(Book book) {
		return bookDao.updateBook(book);
	}

	@Override
	public boolean deleteBook(int bookID) {
		return bookDao.deleteBook(bookID);
	}

}
