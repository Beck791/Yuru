package com.yurucamp.mallSystem.model.service.imp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yurucamp.mallSystem.model.ProductBean;
import com.yurucamp.mallSystem.model.service.ProductService;

@Service
public class PorductServiceImp implements ProductService{

	@Override
	public void insert(ProductBean productBean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(int productId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductBean> queryAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean queryOne(int i) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean querylast() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
