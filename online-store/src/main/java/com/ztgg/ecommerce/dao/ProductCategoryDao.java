package com.ztgg.ecommerce.dao;

import java.util.List;

import com.ztgg.ecommerce.entity.ProductCategory;

public interface ProductCategoryDao {
	/**
	 * this function returns a list of ProductCategory
	 * @return ProductCategoryList
	 */
	List<ProductCategory> queryProductCategory();
}
