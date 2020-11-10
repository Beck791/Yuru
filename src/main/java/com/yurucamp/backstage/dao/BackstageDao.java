package com.yurucamp.backstage.dao;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.backstage.model.CalendarBean;
import com.yurucamp.backstage.model.Test;
import com.yurucamp.member.model.MemberBean;

public interface BackstageDao {
	List<Test> getAllProducts() throws SQLException;

	List<MemberBean> getMember(String Account) throws SQLException;

	List<CalendarBean> getCalendarQuery(String attribute);
}
