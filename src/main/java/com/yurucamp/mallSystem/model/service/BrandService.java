package com.yurucamp.mallSystem.model.service;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.mallSystem.model.BrandBean;

public interface BrandService {
	
	public void insert(BrandBean brandBean) throws SQLException;

	public void update(BrandBean brandBean) throws SQLException;

	public void deleteOne(int id) throws SQLException;

	public List<BrandBean> queryAll() throws SQLException;

	public BrandBean queryOne(int id) throws SQLException;
	
	public BrandBean querylast() throws SQLException;
}
