package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.exercise1.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
    	Customer cust=(Customer) ac.getBean("CustomerBean");
    	System.out.println("Customer Details: ");
    	System.out.println(cust.getFirstName());
    	System.out.println(cust.getMiddleName());
    	System.out.println(cust.getLastName());
    	System.out.println(cust.getDateOfBirth());
    	System.out.println(cust.getEmailID());
    	
    	Rooms room=(Rooms) ac.getBean("RoomsBean");
    	System.out.println("Room Details: ");
    	System.out.println(room.getRoomNo());
    	System.out.println(room.getBedSize());
    	System.out.println(room.getPrice());
    	
    	BookingDetails book=(BookingDetails) ac.getBean("BookingDetailsBean");
    	System.out.println("Booking Details: ");
    	System.out.println(book.getPayMethod());
    	
    	
    }
}
