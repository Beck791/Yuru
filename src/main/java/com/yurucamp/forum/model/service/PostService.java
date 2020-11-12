package com.yurucamp.forum.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.dao.PostDao;
import com.yurucamp.forum.model.dao.PostDaoImpl;
import com.yurucamp.forum.model.dao.QueryPostDaoImpl;
import com.yurucamp.mallsystem.model.BrandBean;

@Service
@Transactional
public class PostService {

	@Autowired
	private PostDaoImpl postDaoImpl ;
	@Autowired
	private QueryPostDaoImpl queryPostDaoImpl;

	
	public void insertPost(PostBean postBean) throws SQLException {
		postDaoImpl.insertPost(postBean);
	}


	public PostBean queryOne(Integer id) throws SQLException {
		return queryPostDaoImpl.queryOneArticle(id);
	}

	public PostBean read(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteOne(Integer id) {
		// TODO Auto-generated method stub
		
	}


	public List<PostBean> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
