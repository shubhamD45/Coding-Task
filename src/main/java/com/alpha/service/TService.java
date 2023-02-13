package com.alpha.service;


import java.util.List;

import com.alpha.model.Product;


public interface TService {

	void saveProduct(Product product);

	List<Product> GetAllProducts();

	Product GetProductById(int id);

	void DeleteProduct(int id);

}
