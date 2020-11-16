package com.yurucamp.mallsystem.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.mallsystem.model.ProductBean;

public interface ShoppingCartDao {
	
	public void insert(Integer id) throws SQLException;

	public void update(ProductBean productBean) throws SQLException;

	public void deleteOne(Integer id) throws SQLException;

	public List<ProductBean> queryAll() throws SQLException;
	
	public List<ProductBean> queryByProductId(Integer productId)throws SQLException;
	
}
