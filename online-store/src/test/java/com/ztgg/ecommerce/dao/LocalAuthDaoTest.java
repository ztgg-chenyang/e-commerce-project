package com.ztgg.ecommerce.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztgg.ecommerce.BaseTest;
import com.ztgg.ecommerce.entity.LocalAuth;

public class LocalAuthDaoTest extends BaseTest {
	@Autowired
	private LocalAuthDao localAuthDao;
	
	@Test
	public void testQueryShopCategory() {
		List<LocalAuth> list = localAuthDao.queryLocalAuth();
		assertEquals(list.size(),1);
	}
}
