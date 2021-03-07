package com.newtechbookstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.newtechbookstore.dao.BookDao;
import com.newtechbookstore.dao.impl.BookDaoImpl;
import com.newtechbookstore.model.Book;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/view")
public class BookServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	BookDao bookDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			bookDao=new BookDaoImpl();
			List<Book> allBooks=bookDao.getAllBooks();
			RequestDispatcher rd=request.getRequestDispatcher("bookDetails.jsp");
			request.setAttribute("allBooks", allBooks);
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String bookName = request.getParameter("bookname");
		 
		 try{
				bookDao=new BookDaoImpl();
				Book book=bookDao.getBookByName(bookName);
				RequestDispatcher rd=request.getRequestDispatcher("bookDetails.jsp");
				request.setAttribute("book", book);
				List<Book> allBooks=bookDao.getAllBooks();
				request.setAttribute("allBooks", allBooks);
				rd.include(request, response);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
	}

	
}
