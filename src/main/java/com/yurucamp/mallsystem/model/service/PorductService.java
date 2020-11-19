package com.yurucamp.mallsystem.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.ItemStatus;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.dao.BrandDao;
import com.yurucamp.mallsystem.model.dao.ProductDao;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Service
@Transactional
public class PorductService {

	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	BrandDao brandDao;
	
	

	public void insert(ProductBean productBean) throws SQLException {
		productDao.insert(productBean);	
	}


	public void update(ProductBean productBean) throws SQLException {
		productDao.update(productBean);
	}


	public void deleteOne(int id) throws SQLException {
		productDao.deleteOne(id);
		
	}


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


	public ProductBean queryOne(int id) throws SQLException {
		
		ProductBean productBean =productDao.queryOne(id);
		
		BrandBean brandBean = brandDao.queryOne(productBean.getBrandId());
		productBean.setBrand(brandBean.getName());
		
		ItemStatus itemStatus = productDao.queryOneStatus(productBean.getStatusId());
		productBean.setStatus(itemStatus.getName());;
		
		return productDao.queryOne(id);
	}

	public Integer queryId(String status) throws SQLException {
		return productDao.queryId(status);
	}


	public ItemStatus queryOneStatus(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public JSONArray querypage() throws SQLException{
//		JSONArray jsonArray = new JSONArray();
//		List<ProductBean> list = productDao.querypage();
//		for (ProductBean productBean : list) {
//		
//			BrandBean brandBean = brandDao.queryOne(productBean.getBrandId());
//			productBean.setBrand(brandBean.getName());
//			
//			ItemStatus itemStatus = productDao.queryOneStatus(productBean.getStatusId());
//			productBean.setStatus(itemStatus.getName());
//			JSONObject jobj = JSONObject.fromObject(productBean);
//			
//			jsonArray.add(jobj);
//		}
//			
//		return jsonArray;
//	}
	public List<ProductBean> querypage() throws SQLException{
		
		List<ProductBean> list = productDao.querypage();
		for (ProductBean productBean : list) {
			
			BrandBean brandBean = brandDao.queryOne(productBean.getBrandId());
			productBean.setBrand(brandBean.getName());
			
			ItemStatus itemStatus = productDao.queryOneStatus(productBean.getStatusId());
			productBean.setStatus(itemStatus.getName());;
		}
		
		return list;
	}

	public Map<Integer,ProductBean> queryallon() throws SQLException{
		return productDao.queryallon();
		
	}
	public List<ProductBean> queryAllon() throws SQLException{
		return productDao.queryAllon();
		
		
	}
}
