package com.newtechbookstore.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newtechbookstore.dao.RegisterDao;
import com.newtechbookstore.dao.impl.RegisterDaoImpl;
import com.newtechbookstore.model.Address;
import com.newtechbookstore.model.Customer;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid;
		String firstname;
		String lastname;
		String gender;
		String dob;
		/*String streetNo,lane,city,state;*/
		String phone;
		String email;
		String password;
		String address;
		
		try {
			userid = request.getParameter("userid");
			firstname = request.getParameter("fname");
			lastname = request.getParameter("lname");
			gender = request.getParameter("gender");
			dob = request.getParameter("dob");
			Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			/*streetNo = request.getParameter("streetno");
			lane=request.getParameter("lane");
			city=request.getParameter("city");
			state=request.getParameter("state");
			zip=Integer.parseInt(request.getParameter("zip"));*/
			address=request.getParameter("address");
			phone = request.getParameter("phone");
			email = request.getParameter("email");
			password = request.getParameter("password");
			RegisterDao rdao = new RegisterDaoImpl();
			Customer c = new Customer();
			Address addr=new Address();
			/*addr.setCity(city);
			addr.setLane(lane);
			addr.setState(state);
			addr.setStreetNo(streetNo);
			addr.setZipCode(zip);*/
			addr.setAddress(address);
			c.setUserid(userid);
			c.setFirstname(firstname);
			c.setLastname(lastname);
			c.setGender(gender);
			c.setDob(dateOfBirth);
			c.setCustomerAddress(addr);
			c.setPhone(phone);
			c.setEmail(email);
			c.setPassword(password);
			if (rdao.register(c)) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				request.setAttribute("customer", c);
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
