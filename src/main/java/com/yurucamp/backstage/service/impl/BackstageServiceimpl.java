package com.yurucamp.backstage.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurucamp.backstage.dao.BackstageDao;
import com.yurucamp.backstage.model.CalendarBean;
import com.yurucamp.backstage.model.Test;
import com.yurucamp.backstage.service.BackstageService;
import com.yurucamp.member.model.MemberBean;

@Service
public class BackstageServiceimpl implements BackstageService {
	
	@Autowired
	BackstageDao backstageDao;
    
	@Override
	public List<Test> getAllProducts() throws SQLException {
		return backstageDao.getAllProducts();
	}

	@Override
	public List<MemberBean> getMember(String Account) throws SQLException {
		return backstageDao.getMember(Account);
	}
	
	@Override
	public List<CalendarBean> getCalendarQuery(String attribute) {
		// TODO Auto-generated method stub
		return backstageDao.getCalendarQuery(attribute);
	}
    
	
}
