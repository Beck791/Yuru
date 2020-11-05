package com.yurucamp.forum.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.forum.model.PostBean;

@Repository
public class PostDaoImpl implements PostDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PostDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public PostBean insertpoTitle(PostBean poTitle) {
		sessionFactory.getCurrentSession().save(poTitle);
		return poTitle;
	}
	
//	
//	@Override
//	public poTitle insertArticleTitle(poTitle title) {
//		return poTitle;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
