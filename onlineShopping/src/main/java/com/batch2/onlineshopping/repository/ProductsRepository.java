package com.batch2.onlineshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch2.onlineshopping.entity.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer>
 {

	Products getProductsById(int productId);

	//@Query(value = "SELECT id, name, category, brand, description, cost, quantity FROM products WHERE category=?1", nativeQuery = true)
	public List<Products> getProductsByCategory(String category);


}
