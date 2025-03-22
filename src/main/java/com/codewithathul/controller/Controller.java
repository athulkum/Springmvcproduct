package com.codewithathul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewithathul.entity.Products;
import com.codewithathul.repo.ProductRepository;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		Products products = new Products();
		model.addAttribute("products", products);
		
		return "index";
	}
	
	@PostMapping("/save")
	public String saveProduct(Products p , Model model) {
		
		Products products =  repository.save(p);
		if(products.getId()!=null) {
			
			model.addAttribute("msg", "products saved");
		}
		
		return "index";
	}

}
