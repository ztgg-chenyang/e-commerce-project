package com.ztgg.ecommerce.dao;

import java.util.List;

import com.ztgg.ecommerce.entity.User;

public interface UserDao {
	/**
	 * this function returns a list of User
	 * @return UserList
	 */
	List<User> queryUser();
}
