package com.yurucamp.forum.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.yurucamp.forum.model.PostBean;

@Repository
public class QueryPostDaoImpl implements QueryPostDao  {
	
	
	private SessionFactory sessionFactory;
	
	
	@Autowired
	public QueryPostDaoImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public PostBean queryOneArticle(PostBean po) {
		po = sessionFactory.getCurrentSession().get(PostBean.class, po.getPoId());
		return po;
		
		
	}
	@Override	
	public List<PostBean> queryAllArticleByPoTitle() {
		Query<PostBean> query = sessionFactory.getCurrentSession()
				.createQuery("from PostBean", PostBean.class);				
		List<PostBean> list = query.list();
		return list;
		
	}

	
	@Override	
	public List<PostBean> queryArticleByPoTitle(PostBean po) {
		Query<PostBean> query = sessionFactory.getCurrentSession()
				.createQuery("from PostBean where poTitle=?1", PostBean.class)
				.setParameter(1, po.getPoTitle());
		List<PostBean> list = query.list();
		return list;
	}	
	@Override	
	public List<PostBean> queryArticleByMemberId(PostBean po) {
		Query<PostBean> query = sessionFactory.getCurrentSession()
				.createQuery("from PostBean where MemberId=?1", PostBean.class)
				.setParameter(1, po.getMemberId());
		List<PostBean> list = query.list();
		return list;
		
	}
	
	
	
	
	
	

	
}
