package com.yurucamp.member.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberCenterDao;

@Service
@Transactional
public class MemberCenterService {

	@Autowired
	private MemberCenterDao memberCenterDao;

	public MemberBean queryMem(String memberId) throws SQLException {
		System.out.println("ServicememberId="+memberId);
		return memberCenterDao.queryMem(memberId); 
	}
	
	public String add(MemberBean mBean) throws SQLException {
//		System.out.println("ServicememberId="+memberId);
		String mes=memberCenterDao.addMem(mBean);
		System.out.println(mBean);
		return mes;
	}

}
