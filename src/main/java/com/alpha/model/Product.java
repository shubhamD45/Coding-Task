package com.alpha.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@SequenceGenerator(name = "Test", sequenceName = "Test_sequence",initialValue = 5000 , allocationSize = 1)
	@GeneratedValue(generator = "Test" , strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String details;
	
	private Double price;
	
	private int quantity;
	
	private Double totalPrice;
	
	private Date createdDate;
}
