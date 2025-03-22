package com.codewithathul.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithathul.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
