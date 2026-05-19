package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	List<Product> findAll();

}
