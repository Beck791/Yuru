package com.yurucamp.forum.model.service;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.ReplyBean;
import com.yurucamp.forum.model.dao.PostDao;
import com.yurucamp.forum.model.dao.ReplyDao;

@Service
@Transactional
public class ArticleService {
	
	@Autowired
	private PostDao postDao;
	
	@Autowired
	private ReplyDao replyDao;
	
	public void insertPost(PostBean postBean) throws SQLException {
		postDao.insertMainPost(postBean);
	}

	
	public void insertReply(ReplyBean replyBean) throws SQLException {
		replyDao.insertReply(replyBean);
	}
	
	public  PostBean queryPostId(Integer poId) throws SQLException {
		PostBean po = postDao.queryPostId(poId);
		return po;
		}
	
	public  List<PostBean> queryPostIdAll(Integer poId) throws SQLException {
		List<PostBean> po = postDao.queryPostIdAll(poId);
		return po;
	}
	public  List<ReplyBean> queryPoIdAllReply(Integer poId) throws SQLException {
		List<ReplyBean> re = replyDao.queryPoIdAllReply(poId);
		return re;
	}


	public void deleteOne(Integer id) {
		// TODO Auto-generated method stub
		
	}


	public List<PostBean> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
