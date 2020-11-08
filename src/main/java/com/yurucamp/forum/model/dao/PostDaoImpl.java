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
	
	
//	@Override   // 
//	public PostBean insertPoTitle(PostBean poTitle) {
//		List<PostBean> query = sessionFactory.getCurrentSession()
//		.createQuery("FROM Post WHERE forumId=?1 AND poTitle=?2",PostBean.class)
//		.setParameter(1, poTitle.getForumId())
//		.setParameter(2, poTitle.getPoId())
//		.list();
//		
//		if (query.size() > 0) {
//			return null;}
//		sessionFactory.getCurrentSession().save(poTitle);
//		
//		return poTitle;
//	}
	
	@Override
	public PostBean insertPost(PostBean po) {
		sessionFactory.getCurrentSession().saveOrUpdate(po);
		return po;
	}
	
//	
//	@Override
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

	
	@Override
	public boolean deleteOnePost(PostBean po) {
		PostBean delete = sessionFactory.getCurrentSession()
				.get(PostBean.class, po.getPoId());
		if (delete != null) {
			sessionFactory.getCurrentSession()
			.delete(delete);
			return true;
		}
		return false;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
