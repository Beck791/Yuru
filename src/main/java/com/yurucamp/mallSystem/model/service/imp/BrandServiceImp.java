package com.yurucamp.mallSystem.model.service.imp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurucamp.mallSystem.model.BrandBean;
import com.yurucamp.mallSystem.model.dao.BrandDao;
import com.yurucamp.mallSystem.model.service.BrandService;

@Service
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
	public void deleteOne(int id) throws SQLException {
		brandDao.deleteOne(id);

	}

	@Override
	public List<BrandBean> queryAll() throws SQLException {
		return brandDao.queryAll();
	}

	@Override
	public BrandBean queryOne(int id) throws SQLException {
		return brandDao.queryOne(id);
	}

	@Override
	public BrandBean querylast() throws SQLException {
		return brandDao.querylast();
	}

}
