package com.postman.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postman.webservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
