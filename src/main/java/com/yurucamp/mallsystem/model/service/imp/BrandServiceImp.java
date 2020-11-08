package com.yurucamp.mallsystem.model.service.imp;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.dao.BrandDao;
import com.yurucamp.mallsystem.model.service.BrandService;

@Service
@Transactional
public class BrandServiceImp implements BrandService {

	@Autowired
	BrandDao brandDao;

	@Override
	public void insert(BrandBean brandBean) throws SQLException {
		brandDao.insert(brandBean);

	}

	@Override
	public void update(BrandBean brandBean) throws SQLException {
		brandDao.update(brandBean);

	}
	
	@Override
	public List<BrandBean> queryAll() throws SQLException {
		return brandDao.queryAll();
	}

	@Override
	public BrandBean queryOne(Integer id) throws SQLException {
		return brandDao.queryOne(id);
	}

	@Override
	public BrandBean querylast() throws SQLException {
		return brandDao.querylast();
	}

	@Override
	public List<BrandBean> querypage() throws SQLException {	    
		return  brandDao.querypage();
		
	}

	@Override
	public void deleteOne(Integer id) throws SQLException {
		      brandDao.deleteOne(id);
		
	}

	@Override
	public Integer queryId(String brandname) throws SQLException {
		
		return brandDao.queryId(brandname);
	}

}
