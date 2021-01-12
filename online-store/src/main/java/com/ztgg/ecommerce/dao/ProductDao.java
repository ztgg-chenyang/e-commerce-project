package com.ztgg.ecommerce.dao;

import java.util.List;

import com.ztgg.ecommerce.entity.Product;

public interface ProductDao {
	/**
	 * this function returns a list of Product
	 * @return ProductList
	 */
	List<Product> queryProduct();
}
