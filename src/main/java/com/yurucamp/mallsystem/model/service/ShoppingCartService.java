package com.yurucamp.mallsystem.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yurucamp.mallsystem.model.ShoppingCart;
import com.yurucamp.mallsystem.model.dao.ShoppingCartDao;

public class ShoppingCartService {
	
	@Autowired
	ShoppingCartDao shoppingCartDao ;
	
	public void insert(Integer productId) throws SQLException {
		shoppingCartDao.insert(productId);
	}

	public void update(ShoppingCart shoppingCart) throws SQLException {
		shoppingCartDao.update(shoppingCart);
	}

	public void deleteProduct(Integer productId) throws SQLException {
		shoppingCartDao.deleteProduct(productId);
	}

	public List<ShoppingCart> queryAll(Integer memberId) throws SQLException {
		return shoppingCartDao.queryAll(memberId);
	}

	
}
