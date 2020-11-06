package com.yurucamp.camp.model.service;

import java.sql.SQLException;

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
		CampInfo campBean = campDao.saveCamp(campInfo);
		return campBean;
	}

}
