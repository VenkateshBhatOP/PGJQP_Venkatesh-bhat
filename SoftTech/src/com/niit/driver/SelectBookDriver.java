package com.niit.driver;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.model.Book;

import java.util.List;


public class SelectBookDriver {
	



		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				SessionFactory sessionfactory;
				Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
				sessionfactory = configuration.buildSessionFactory();
				Session session = sessionfactory.openSession();
				@SuppressWarnings("unchecked")
				List<Book> allBook = session.createQuery("from Book").list();
				if (!(allBook.isEmpty())) {
					for (Book book : allBook) {
						System.out.println("BookId: " + book.getBookId() + " Name: " + book.getName()
								+ " custname: " +book.getCustname()+ " Price: " + book.getPrice());

					}
				} else {
					System.out.println("No record found...Please add record to view them.");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}


