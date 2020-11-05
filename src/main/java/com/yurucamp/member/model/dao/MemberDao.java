package com.yurucamp.member.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.yurucamp.member.model.MemberBean;

public interface MemberDao {
	
	List<MemberBean> queryUserId(String Account, String Password) throws SQLException;

}
