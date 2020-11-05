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
	public PostBean insertPoTitle(PostBean poTitle) {
		sessionFactory.getCurrentSession().save(poTitle);
		
		return poTitle;
	}
	
	@Override
	public PostBean insertPoContent(PostBean poContent) {
		sessionFactory.getCurrentSession().save(poContent);
		return poContent;
	}

	
	@Override
	public PostBean updatePoTitle(PostBean poTitle) {
		
		
		return poTitle;
	}
	@Override
	public PostBean deleteOnePoTitle(PostBean poTitle) {
		
		
		return poTitle;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
