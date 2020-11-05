package com.yurucamp.forum.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.forum.model.ForumBean;

@Repository
public class ForumDaoImpl implements ForumDao {

	
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public ForumDaoImpl(@Qualifier("SessionFactory") SessionFactory sessionFactory)  {
	this.sessionFactory = sessionFactory;
		
	}
	
	

	@Override
	public ForumBean insertForum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumBean updateOneForum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumBean deleteOneForum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumBean queryOneForum() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumBean queryAllForum() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
}
	
	
	

