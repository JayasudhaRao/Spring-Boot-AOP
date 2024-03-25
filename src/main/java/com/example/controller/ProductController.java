package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@GetMapping("/AllProducts")
	public String getProductDetails()
	{
		
		ps.displayMsg();
		return "not yet implemented business logic";
	}

}
