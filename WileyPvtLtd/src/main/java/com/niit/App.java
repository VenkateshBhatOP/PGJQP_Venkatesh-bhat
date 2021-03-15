package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.exercise3.Order;
import com.chapter2.exercise3.Author;
import com.chapter2.exercise3.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
    	Author author=(Author) ac.getBean("AuthorBean");
    	System.out.println("The author details: ");
    	System.out.println(author.getFirstName());
    	System.out.println(author.getMiddleName());
    	System.out.println(author.getLastName());
    	

    	Book book1=(Book) ac.getBean("book1");
    	Book book2=(Book) ac.getBean("book2");
    	System.out.println("The book details are: ");
    	System.out.println(book1.getBooks());
    	System.out.println(book2.getBooks());
    	
    	Order order=(Order) ac.getBean("OrderBean");
    	System.out.println("The ordered items are: ");
    	System.out.println(order.getOrder());
    }
}
