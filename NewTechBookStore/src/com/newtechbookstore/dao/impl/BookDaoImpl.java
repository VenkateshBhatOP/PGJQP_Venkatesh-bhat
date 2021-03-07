package com.newtechbookstore.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.newtechbookstore.dao.BookDao;
import com.newtechbookstore.util.HibernateUtil;
import com.newtechbookstore.model.Book;

public class BookDaoImpl implements BookDao{

	public Book getBookByName(String bookName) {
		try
		{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Criteria criteria=session.createCriteria(Book.class);
			criteria.add(Restrictions.eq("bookName", bookName));
			Book book=(Book) criteria.uniqueResult();
			tx.commit();
			return book;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	public List<Book> getAllBooks() {
		try
		{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Book> allBooks=session.createQuery("from Book").list();
			tx.commit();
			return allBooks;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

}
