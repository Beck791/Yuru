package com.yurucamp.backstage.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yurucamp.backstage.model.Test;


@Repository
public class BackstageDao {
	
	@Autowired
	SessionFactory factory;
	
	
	@SuppressWarnings("unchecked")
	public List<Test> getAllProducts() {
		String hql = "FROM Test";
		Session session = null;
		List<Test> list = new ArrayList<>();
		session = factory.getCurrentSession();
		list = session.createQuery(hql).getResultList();
		return list;
	}
}
