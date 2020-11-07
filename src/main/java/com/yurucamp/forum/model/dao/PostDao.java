package com.yurucamp.forum.model.dao;

import com.yurucamp.forum.model.PostBean;

public interface PostDao {

	PostBean insertPost(PostBean po);

	PostBean updatePost(PostBean po);

	boolean deleteOnePost(PostBean po);

	

}