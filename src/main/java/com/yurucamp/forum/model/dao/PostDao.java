package com.yurucamp.forum.model.dao;

import java.sql.SQLException;

import com.yurucamp.forum.model.PostBean;

public interface PostDao {

	void insertPost(PostBean postBean) throws SQLException;

//	PostBean updatePost(PostBean po);

	boolean deleteOne(PostBean postBean) throws SQLException;

	public PostBean queryOne(Integer id)throws SQLException;
	
	
	

	

}