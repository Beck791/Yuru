package com.yurucamp.mallSystem.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.yurucamp.mallSystem.model.ProductBean;


public interface ProductDao {

	public void insert(ProductBean productBean) throws SQLException;

	public void update(ProductBean productBean) throws SQLException;

	public void deleteOne(int id) throws SQLException;

	public List<ProductBean> queryAll() throws SQLException;

	public ProductBean queryOne(int id) throws SQLException;
	
	public ProductBean querylast() throws SQLException;
}