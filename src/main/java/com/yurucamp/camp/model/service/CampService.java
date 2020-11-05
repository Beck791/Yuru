package com.yurucamp.camp.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.camp.model.dao.CampDao;

@Service
@Transactional
public class CampService {

	private CampDao campDao;

	public CampInfo saveCamp(CampInfo campInfo) {
		CampInfo campBean = campDao.saveCamp(campInfo);
		return campBean;
	}

}
