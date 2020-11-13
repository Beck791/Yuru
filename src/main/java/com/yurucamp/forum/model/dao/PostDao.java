package com.yurucamp.forum.model.dao;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.forum.model.PostBean;

@Repository
public class PostDao {

	
private SessionFactory sessionFactory;
	
	@Autowired
	public PostDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public void  insertMainPost(PostBean postBean) throws SQLException {
		sessionFactory.getCurrentSession().saveOrUpdate(postBean);
	}
	
	public PostBean queryPostId(Integer poId){
		PostBean PostBean = sessionFactory.getCurrentSession().get(PostBean.class, poId);
		return PostBean;
	}
	
	
	public boolean deleteOne(PostBean postBean) {
		PostBean delete = sessionFactory.getCurrentSession()
				.get(PostBean.class, postBean.getPoId());
		if (delete != null) {
			sessionFactory.getCurrentSession()
			.delete(delete);
			return true;
		}
		return false;
	}
	
	
	public void  updatePost(PostBean postBean) throws SQLException {
		sessionFactory.getCurrentSession().saveOrUpdate(postBean);
	}
	
//	public PostBean updatePost(PostBean po) {
//		PostBean  post = sessionFactory.getCurrentSession()
//				.get(PostBean.class,po.getPoId());
//		
//		post.setPoTitle(po.getPoTitle());
//		post.setPoUpDateTime(po.getPoUpDateTime());
//		post.setPoContent(po.getPoContent());
//		post.setPoUpDateTime(po.getPoUpDateTime());
//		post.setLikeNumber(po.getLikeNumber());
//		post.setReContentNumber(po.getReContentNumber());
//		post.setClickNumber(po.getClickNumber());
//		return post;
//	}
//	
	
	
	
	
}
