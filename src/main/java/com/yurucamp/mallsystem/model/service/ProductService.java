package com.yurucamp.mallsystem.model.service;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.mallsystem.model.ProductBean;

public interface ProductService {

	public void insert(ProductBean productBean) throws SQLException;

	public void update(ProductBean productBean) throws SQLException;

	public void deleteOne(int id) throws SQLException;

	public List<ProductBean> queryAll() throws SQLException;

	public ProductBean queryOne(int id) throws SQLException;
	
	public ProductBean querylast() throws SQLException;
	

	
}
