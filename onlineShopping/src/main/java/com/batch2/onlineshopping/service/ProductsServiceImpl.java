package com.batch2.onlineshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch2.onlineshopping.entity.Products;
import com.batch2.onlineshopping.repository.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	ProductsRepository productsRepository;
    @Override
	public Products addProducts(Products products) {

		return productsRepository.save(products);
	}

	@Override
	public Optional<Products> getProducts(int id) {
		
		return productsRepository.findById(id);
	}

	@Override
	public Products updateProducts(Products products, int id) {
		
		products.setId(id);
		return productsRepository.save(products);
	}
	@Override
	public String deleteProducts(int id) {
		if(productsRepository.existsById(id)) {
			
			productsRepository.deleteById(id);

			return "Product deleted successfuly";
		}
		return "Product can't find";
	}

	@Override
	public List<Products> getProductsByCategory(String category) {
		
		return null;
	}
}
