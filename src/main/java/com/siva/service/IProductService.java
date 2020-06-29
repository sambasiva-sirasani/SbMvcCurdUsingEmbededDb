package com.siva.service;

import java.util.List;

import com.siva.model.Product;

public interface IProductService {

	void saveProduct(Product p);
	List<Product>getAllProducts();
	void deleteProduct(Integer id);
	Product getOneProduct(Integer id);
	void updateProduct(Product p);
	
	
}
