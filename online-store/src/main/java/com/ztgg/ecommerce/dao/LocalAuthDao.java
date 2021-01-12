package com.ztgg.ecommerce.dao;

import java.util.List;

import com.ztgg.ecommerce.entity.LocalAuth;

public interface LocalAuthDao {
	/**
	 * this function returns a list of LocalAuth
	 * @return LocalAuthList
	 */
	List<LocalAuth> queryLocalAuth();
}
