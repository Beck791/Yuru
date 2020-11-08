package com.yurucamp.mallsystem.model.service.imp;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.ItemStatus;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.dao.BrandDao;
import com.yurucamp.mallsystem.model.dao.ProductDao;
import com.yurucamp.mallsystem.model.service.ProductService;

@Service
@Transactional
public class PorductServiceImp implements ProductService{

	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	BrandDao brandDao;
	
	
	@Override
	public void insert(ProductBean productBean) throws SQLException {
		productDao.insert(productBean);	
	}

	@Override
	public void update(ProductBean productBean) throws SQLException {
		productDao.update(productBean);
	}

	@Override
	public void deleteOne(int id) throws SQLException {
		productDao.deleteOne(id);
		
	}

	@Override
	public List<ProductBean> queryAll() throws SQLException {
		
		List<ProductBean> list = productDao.queryAll();
		for (ProductBean productBean : list) {
		
			BrandBean brandBean = brandDao.queryOne(productBean.getBrandId());
			productBean.setBrand(brandBean.getName());
			
			ItemStatus itemStatus = productDao.queryOneStatus(productBean.getStatusId());
			productBean.setStatus(itemStatus.getName());;
		}
			
		return list;
	}

	@Override
	public ProductBean queryOne(int id) throws SQLException {
		return productDao.queryOne(id);
	}

	@Override
	public ProductBean querylast() throws SQLException {
		return productDao.querylast();
	}

	@Override
	public Integer queryId(String status) throws SQLException {
		return productDao.queryId(status);
	}

	@Override
	public ItemStatus queryOneStatus(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
