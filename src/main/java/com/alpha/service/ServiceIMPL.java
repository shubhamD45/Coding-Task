package com.alpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.model.Product;
import com.alpha.repository.TRepository;

@Service
public class ServiceIMPL implements TService {

	@Autowired
	private TRepository repo;

	@Override
	public void saveProduct(Product product) {

		repo.save(product);
	}

	@Override
	public List<Product> GetAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product GetProductById(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void DeleteProduct(int id) {
	
		repo.deleteById(id);
		
	}
}
