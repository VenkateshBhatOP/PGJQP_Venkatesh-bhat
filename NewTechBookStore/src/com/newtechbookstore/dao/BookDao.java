package com.newtechbookstore.dao;


import java.util.List;
import com.newtechbookstore.model.Book;
public interface BookDao {

	Book getBookByName(String bookName);
	List<Book> getAllBooks();
}
