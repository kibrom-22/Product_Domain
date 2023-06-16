package com.snva.demo.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snva.demo.dto.ProductRequest;
import com.snva.demo.entity.Product;
import com.snva.demo.service.ProductService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
	

	private final ProductService productService;
	
	@PostMapping("/addProduct")//creates new product and store it in to MySQL database
	public ResponseEntity<Product> addProduct(@RequestBody @Valid ProductRequest productRequest){
		
		return new ResponseEntity<Product>(productService.addProduct(productRequest), HttpStatus.CREATED);
	}

}
