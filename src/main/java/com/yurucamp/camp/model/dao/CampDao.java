package com.yurucamp.camp.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.camp.model.CampInfo;

@Repository
public class CampDao {

	@Autowired
	SessionFactory sessionFactory;

	public CampDao() {
	}

	@Autowired
	public CampDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public CampInfo saveCamp(CampInfo campInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(campInfo);
		return campInfo;
	}

	public void queryCamp(Integer id) {

	}

}
