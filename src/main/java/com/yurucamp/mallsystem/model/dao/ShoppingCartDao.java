package com.yurucamp.mallsystem.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.mallsystem.model.ShoppingCart;

public interface ShoppingCartDao {
	
	public void insert(Integer productId) throws SQLException;

	public void update(ShoppingCart shoppingCart) throws SQLException;

	public void deleteProduct(Integer productId) throws SQLException;

	public List<ShoppingCart> queryAll(Integer memberId) throws SQLException;

	boolean quantityExists(Integer productId);
	
//	public List<ShoppingCart> queryByProductId(Integer productId)throws SQLException;
	
}
