package com.newtechbookstore.dao;

import com.newtechbookstore.model.Customer;


public interface LoginDao {
	Customer validUser(String username,String password);
}
