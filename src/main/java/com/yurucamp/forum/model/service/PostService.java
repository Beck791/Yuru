package com.yurucamp.forum.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.dao.PostDaoImpl;
import com.yurucamp.forum.model.dao.QueryPostDaoImpl;

@Service
@Transactional
public class PostService {

	@Autowired
	private PostDaoImpl postDaoImpl ;
	@Autowired
	private QueryPostDaoImpl queryPostDaoImpl;

		
	
	
	public PostBean insertPost(PostBean Po) {
		return postDaoImpl.insertPost(Po);
	}

	
	

	public PostBean read(Integer poId) {
		return queryPostDaoImpl.queryOneArticle(poId);		
		
	}
	
	
	
	
	
	
	
	
	
}
