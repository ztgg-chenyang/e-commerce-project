package com.ztgg.ecommerce.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztgg.ecommerce.BaseTest;
import com.ztgg.ecommerce.entity.ProductCategory;

public class ProductCategoryDaoTest extends BaseTest {
	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Test
	public void testQueryShopCategory() {
		List<ProductCategory> list = productCategoryDao.queryProductCategory();
		assertEquals(list.size(),1);
	}
}
