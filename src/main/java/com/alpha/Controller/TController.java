package com.alpha.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.model.Product;
import com.alpha.service.TService;

@RestController
@RequestMapping("/Task")
public class TController {

	@Autowired
	private TService service;
	
	@GetMapping("/")
	public ResponseEntity<String> Check() {
		
		return new ResponseEntity<String>("Application working", HttpStatus.OK);
	}
	

	@PostMapping("/Save")
	public ResponseEntity<String> saveProduct(@RequestBody Product product){
		
		service.saveProduct(product);
		return new ResponseEntity<String>("Data saved",HttpStatus.CREATED);
	}
	
	@GetMapping("/GetAllProducts")
	public ResponseEntity<List<Product>> GetAllProducts() {
		List<Product> list = service.GetAllProducts();
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/GetProductById/{id}")
	public ResponseEntity<Product> GetProductById(@PathVariable int id) {
		Product byId = service.GetProductById(id);
		return new ResponseEntity<Product>(byId,HttpStatus.OK);
	}
	
	@PutMapping("/UpdateData")
	public ResponseEntity<String> UpdateProduct(@RequestBody Product product) {
		service.saveProduct(product);
		return new ResponseEntity<String>("Data updated",HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/DeleteData")
	public ResponseEntity<String> DeleteProduct(@PathVariable int id) {
		service.DeleteProduct(id);
		return new ResponseEntity<String>("Data deleted",HttpStatus.OK);
	}
}
