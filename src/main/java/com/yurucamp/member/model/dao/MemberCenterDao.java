package com.yurucamp.member.model.dao;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.member.model.MemberBean;

@Repository
public class MemberCenterDao {

	private SessionFactory sessionFactory;
	
	public MemberCenterDao() {
	}

	@Autowired
	public MemberCenterDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public MemberBean queryMem(String memberId) throws SQLException {
//		MemberBean memInfo = sessionFactory.getCurrentSession().get(MemberBean.class,memberId);
		
		String hql = "from MemberBean where memberId=:memberId";
		System.out.println(hql);
		MemberBean memberBean= (MemberBean) sessionFactory.getCurrentSession().createQuery(hql).setParameter("memberId", memberId).getSingleResult();
//		String memberId = memberBean.getMemberId();
		return memberBean ;	 

	}

}
