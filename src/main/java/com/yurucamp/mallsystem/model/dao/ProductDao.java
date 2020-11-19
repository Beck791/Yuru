package com.yurucamp.mallsystem.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.yurucamp.mallsystem.model.ItemStatus;
import com.yurucamp.mallsystem.model.ProductBean;


public interface ProductDao {

	public void insert(ProductBean productBean) throws SQLException;

	public void update(ProductBean productBean) throws SQLException;

	public void deleteOne(Integer id) throws SQLException;

	public List<ProductBean> queryAll() throws SQLException;

	public ProductBean queryOne(Integer id) throws SQLException;

	public Integer queryId(String status) throws SQLException;

	public ItemStatus queryOneStatus(Integer id) throws SQLException;
	
	public List<ProductBean> querypage() throws SQLException;
	
	public Map<Integer,ProductBean> queryallon() throws SQLException;
	
	public List<ProductBean> queryAllon() throws SQLException;

}
