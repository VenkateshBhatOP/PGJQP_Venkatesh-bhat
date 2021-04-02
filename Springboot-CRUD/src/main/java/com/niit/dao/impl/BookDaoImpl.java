package com.niit.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.BookDao;
import com.niit.model.Book;

@Repository
@Transactional
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Book> getAllBooks() {
		try
		{
			List<Book> allBooks = new ArrayList<Book>();
			allBooks = sessionFactory.getCurrentSession().createQuery("from Book").list();
			return allBooks;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Book getBookByID(int bookID) {
		try
		{
			Book book = sessionFactory.getCurrentSession().get(Book.class, bookID);
			return book;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewBook(Book book) {
		try
		{
			sessionFactory.getCurrentSession().save(book);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBook(Book book) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(book);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteBook(int bookID) {
		try
		{
			Book book = getBookByID(bookID);
			sessionFactory.getCurrentSession().delete(book);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}
