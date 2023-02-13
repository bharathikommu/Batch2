package com.batch2.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.batch2.onlineshopping.entity.Cart;
import com.batch2.onlineshopping.entity.Products;
import com.batch2.onlineshopping.repository.ProductsRepository;
import com.batch2.onlineshopping.repository.UserRepository;

public class CartServiceImpl implements CartService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductsRepository productRepository;

	@Override
	public String addCart(Cart cart) {

		if (productRepository.existsById(cart.getProductId()) && userRepository.existsById(cart.getUserId())) {
			Products products = productRepository.getProductsById(cart.getProductId());
			/*
			 * Customer customer = userRepository.getUserById(cart.getUserId());
			 * customer.getProducts().add(products); products.getUser().add(user);
			 * userRepository.save(user);
			 */
			return "Product added to cart Successfuly";
		}
		return "Unable to add product to cart";
	}

	@Override
	public List<Products> getCart(Integer id) {

		//List<Products> products = userRepository.getUserById(id).getProducts();
		return null;
	}

}
