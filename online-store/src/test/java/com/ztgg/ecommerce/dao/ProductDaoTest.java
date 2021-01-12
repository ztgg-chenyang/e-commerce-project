package com.ztgg.ecommerce.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztgg.ecommerce.BaseTest;
import com.ztgg.ecommerce.entity.Product;

public class ProductDaoTest extends BaseTest {
	@Autowired
	private ProductDao productDao;
	
	@Test
	public void testQueryShopCategory() {
		List<Product> list = productDao.queryProduct();
		assertEquals(list.size(),1);
	}
}
