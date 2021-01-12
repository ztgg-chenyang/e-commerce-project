package com.ztgg.ecommerce.dao;

import java.util.List;

import com.ztgg.ecommerce.entity.ProductImg;

public interface ProductImgDao {
	/**
	 * this function returns a list of ProductImg
	 * @return ProductImgList
	 */
	List<ProductImg> queryProductImg();
}
