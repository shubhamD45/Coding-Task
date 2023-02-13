package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.model.Product;

@Repository
public interface TRepository extends JpaRepository<Product, Integer> {

}
