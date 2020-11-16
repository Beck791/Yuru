package com.yurucamp.mallsystem.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.ItemStatus;
import com.yurucamp.mallsystem.model.ProductBean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public interface ProductDao {

	public void insert(ProductBean productBean) throws SQLException;

	public void update(ProductBean productBean) throws SQLException;

	public void deleteOne(int id) throws SQLException;

	public List<ProductBean> queryAll() throws SQLException;

	public ProductBean queryOne(int id) throws SQLException;

	public Integer queryId(String status) throws SQLException;

	public ItemStatus queryOneStatus(Integer id) throws SQLException;
	
	public JSONArray querypage() throws SQLException;
//	public List<ProductBean> querypage() throws SQLException;
}
