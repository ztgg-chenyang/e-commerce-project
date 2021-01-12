package com.ztgg.ecommerce.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztgg.ecommerce.BaseTest;
import com.ztgg.ecommerce.entity.User;

public class UserDaoTest extends BaseTest{
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testQueryUser() {
		List<User> list = userDao.queryUser();
		assertEquals(list.size(),1);
	}
}
