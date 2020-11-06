package com.yurucamp.camp.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.camp.model.dao.CampDao;

@Service
@Transactional
public class CampService {

	@Autowired
	private CampDao campDao;

	public CampInfo saveCamp(CampInfo campInfo) throws SQLException {
		return campDao.saveCamp(campInfo);
	}

	public CampInfo queryCamp(Integer id) throws SQLException {
		return campDao.queryCamp(id);
	}

	public List<CampInfo> queryAllCamp() throws SQLException {
		return campDao.queryAllCamp();
	}

	public void deleteCamp() throws SQLException {
		campDao.deleteCamp();
	}
	
}
