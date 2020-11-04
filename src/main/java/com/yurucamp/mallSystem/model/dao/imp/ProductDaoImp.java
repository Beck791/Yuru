package com.yurucamp.mallSystem.model.dao.imp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yurucamp.mallSystem.model.ProductBean;
import com.yurucamp.mallSystem.model.dao.ProductDao;

@Repository
public class ProductDaoImp implements ProductDao {

	@Override
	public ProductBean queryOne(int i) throws SQLException {
		
		return null;
	}

	@Override
	public ProductBean querylast() throws SQLException {
		return null;
	}

	@Override
	public void insert(ProductBean productBean) throws SQLException {
		
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
	}

	@Override
	public void deleteOne(int productId) throws SQLException {
	}

	@Override
	public List<ProductBean> queryAll() throws SQLException {
		return null;
	}

}
