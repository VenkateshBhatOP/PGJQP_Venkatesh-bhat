package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProductByID(int productID) {
		return productDao.getProductByID(productID);
	}

	@Override
	public boolean addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public Product updateProduct(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProduct(int productID) {
		// TODO Auto-generated method stub
		return false;
	}

}
