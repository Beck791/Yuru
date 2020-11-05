package com.yurucamp.forum.model.dao;

import com.yurucamp.forum.model.ForumBean;

public interface ForumDao {

	ForumBean insertForum();

	ForumBean updateOneForum();

	ForumBean deleteOneForum();

	ForumBean queryOneForum();

	ForumBean queryAllForum();
	
	
}
