package com.snva.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snva.demo.dto.ProductRequest;
import com.snva.demo.entity.Product;
import com.snva.demo.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service

@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.category(productRequest.getCategory())
				.image(productRequest.getImage())
						
						.build();
return productRepository.save(product);
	}

}
