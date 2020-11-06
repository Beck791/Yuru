package com.yurucamp.camp.model.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.camp.model.CampInfo;

@Repository
public class CampDao {

	private SessionFactory sessionFactory;

	public CampDao() {
	}

	@Autowired
	public CampDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public CampInfo saveCamp(CampInfo campInfo) throws SQLException {
		sessionFactory.getCurrentSession().save(campInfo);
		return campInfo;
	}

	public CampInfo queryCamp(Integer id) throws SQLException {
		CampInfo campInfo = sessionFactory.getCurrentSession().get(CampInfo.class, id);
		return campInfo;
	}

	public List<CampInfo> queryAllCamp() throws SQLException {
		Query<CampInfo> query = sessionFactory.getCurrentSession().createQuery("FROM CampInfo", CampInfo.class);
		List<CampInfo> list = query.list();
		return list;
	}
	
	public void deleteCamp() throws SQLException {
		int n = 1;
		Session session = sessionFactory.getCurrentSession();
		CampInfo ci = new CampInfo();
		ci.setId(n);
		session.delete(ci);
	}

}
