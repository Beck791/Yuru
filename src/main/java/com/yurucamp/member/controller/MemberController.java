package com.yurucamp.member.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberDao;

@Controller
@RequestMapping("/Member")
public class MemberController {
	
	@Autowired
	MemberDao memberDao;
	
	@PostMapping("/SignIn")
	public ModelAndView  MemberIndex(HttpServletRequest request,Model model,String Account,String Password) throws SQLException {
		Map<String, String> rtnMap = new HashMap<String, String>();
		rtnMap.put("code", "00");
		List<MemberBean> memberUser = memberDao.queryUserId(Account,Password);
		HttpSession session = request.getSession();
		
		System.out.println("memberUser"+memberUser);
		if(memberUser.isEmpty()) {
			System.out.println("查詢資料失敗!");
		}else {
			for(MemberBean s:memberUser) {
				session.setAttribute("memberId",s.getMemberId());
				session.setAttribute("memberRolse",s.getRoles());
			}
		}
		
		return new ModelAndView("MemberViewPage","result" , rtnMap);
	}
	
	
	
}
