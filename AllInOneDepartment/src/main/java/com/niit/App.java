package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.exercise2.Customer;
import com.chapter2.exercise2.Order;
import com.chapter2.exercise2.Product;

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
    	System.out.println("The customer details: ");
    	System.out.println(cust.getFirstName());
    	System.out.println(cust.getMiddleName());
    	System.out.println(cust.getLastName());
    	
    	Product product=(Product) ac.getBean("ProductBean");
    	System.out.println("The product details are: ");
    	System.out.println(product.getProducts());
    	
    	Order order=(Order) ac.getBean("OrderBean");
    	System.out.println("The ordered items are: ");
    	System.out.println(order.getOrder());
    	
    }
}
