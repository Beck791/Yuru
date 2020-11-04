package com.yurucamp.camp.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yurucamp.camp.model.CampInfo;

@Repository
public class CampDao {

	@Autowired
	SessionFactory factory;
	
	public CampDao() {
	}

	public int saveCamp(CampInfo campInfo) {
		int n = 0;
		Session session = factory.getCurrentSession();
		session.save(campInfo);
		n++;
		return n;
	}
	
	public void queryCamp(Integer id) {
		int n = 0;
		Session session = factory.getCurrentSession();
		
		n++;
	}
	
}
