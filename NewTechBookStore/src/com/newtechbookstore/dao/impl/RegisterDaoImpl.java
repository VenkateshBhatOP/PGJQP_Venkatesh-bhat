package com.newtechbookstore.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.newtechbookstore.dao.RegisterDao;
import com.newtechbookstore.model.Customer;
import com.newtechbookstore.util.HibernateUtil;

public class RegisterDaoImpl implements RegisterDao {
	@Override
	public boolean register(Customer c) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		try {
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.save(c);
			session.flush();
			tx.commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
}