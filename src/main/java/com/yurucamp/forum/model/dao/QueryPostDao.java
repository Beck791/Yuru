package com.yurucamp.forum.model.dao;

import java.util.List;

import com.yurucamp.forum.model.PostBean;

public interface QueryPostDao {

	PostBean queryOneArticle(PostBean po);

	List<PostBean> queryArticleByPoTitle(PostBean po);

	List<PostBean> queryArticleByMemberId(PostBean po);

	PostBean queryOneArticleTitle(PostBean title);

	List<PostBean> queryAllArticleByPoTitle();

}