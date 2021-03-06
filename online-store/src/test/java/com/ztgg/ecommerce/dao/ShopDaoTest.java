package com.ztgg.ecommerce.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Ignore;

import com.ztgg.ecommerce.BaseTest;
import com.ztgg.ecommerce.entity.Area;
import com.ztgg.ecommerce.entity.Shop;
import com.ztgg.ecommerce.entity.ShopCategory;
import com.ztgg.ecommerce.entity.User;

public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;

	@Test
	@Ignore
	public void testInsertShop() {
		Shop shop = mockANewShop(1L, 4, 1L);
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1, effectedNum);
	}
	
	@Test
	@Ignore
	public void testUpdateShop() {
		Shop shop = new Shop();
		shop.setShopId(6L);
		shop.setShopDesc("updated desc");
		shop.setShopAddr("a new address");
		shop.setTimeUpdated(new Date());
		int effectedNum = shopDao.updateShop(shop);
		assertEquals(1, effectedNum);
	}
	
	private Shop mockANewShop(Long userId, Integer areaId, Long shopCategoryId) {
		Shop shop = new Shop();
		User owner = new User();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		
		owner.setUserId(userId);
		area.setAreaId(areaId);
		shopCategory.setShopCategoryId(shopCategoryId);
		
		shop.setArea(area);
		shop.setOwner(owner);
		shop.setShopCategory(shopCategory);
		shop.setShopName("A New Shop bla bla");
		shop.setShopDesc("this is a shop generated by the unit test");
		shop.setShopAddr("123 Boyton Ave");
		shop.setPhone("4323456753");
		shop.setShopImg("testImg");
		shop.setTimeCreated(new Date());
		shop.setEnableStatus(0);
		shop.setPriority(1);
		
		return shop;
	}
}
