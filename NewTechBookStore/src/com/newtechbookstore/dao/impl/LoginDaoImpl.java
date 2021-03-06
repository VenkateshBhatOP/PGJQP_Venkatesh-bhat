package com.newtechbookstore.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.newtechbookstore.model.Customer;
import com.newtechbookstore.util.HibernateUtil;
import com.newtechbookstore.dao.LoginDao;

public class LoginDaoImpl implements LoginDao{
	public Customer validUser(String username,String password) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Customer> result=session.createQuery("from Customer where userid=:userName").setParameter("userName", username).list();
			tx.commit();
		
			int flag=0;
			Customer customer=new Customer();
			for(Customer stud:result)
			{
				if(stud.getUserid().equals(username) && stud.getPassword().equals(password))
				{
					flag=1;
					customer.setDob(stud.getDob());
					customer.setEmail(stud.getEmail());
					customer.setFirstname(stud.getFirstname());
					customer.setGender(stud.getGender());
					customer.setLastname(stud.getLastname());
					customer.setPassword(customer.getPassword());
					customer.setPhone(stud.getPhone());
					//customer.setCustomerAddress(stud.getCustomerAddress());
					customer.setUserid(stud.getUserid());
					break;
				}
			}
			if(flag==1)
			{
				return customer;
			}
			else
			{
				return null;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

}
