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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberDao;

@Controller
@RequestMapping("/Member")
@SessionAttributes({ "memberBean", "id", "memberRolse", "memberPaid", "image" })
public class MemberController {

	@Autowired
	MemberDao memberDao;

	@SuppressWarnings("null")
	@PostMapping("/SignIn")
	@ResponseBody
	public Map<String, String> MemberIndex(HttpServletRequest request, Model model, String Account, String Password)
			throws SQLException {
		Map<String, String> rtnMap = new HashMap<String, String>();
		MemberBean memberBean = memberDao.queryUserId(Account, Password);
		System.out.println(memberBean);
		System.out.println(memberBean.getName());
		model.addAttribute("memberBean", memberBean);
		model.addAttribute("id", memberBean.getId());
		model.addAttribute("memberRolse", memberBean.getRoles());
		model.addAttribute("memberPaid", memberBean.getPaid());
		model.addAttribute("image", memberBean.getImage());
		
		
		List<MemberBean> memberUser = memberDao.queryaUserId(Account,Password);
		HttpSession session = request.getSession();
		
		if(memberUser.isEmpty()) { 
			rtnMap.put("msg", "查無此帳號!"); 
		}else {
			for(MemberBean s:memberUser) {
				System.out.println("memberId"+s.getMemberId());
				session.setAttribute("memberId",s.getMemberId());
				System.out.println("memberRolse"+s.getRoles());
                session.setAttribute("memberRolse",s.getRoles().toString().trim());
				System.out.println("memberPaid"+s.getPaid());
                session.setAttribute("memberPaid",s.getPaid().toString().trim()); 
                session.setAttribute("id",s.getId().toString().trim()); 
                session.setAttribute("image",s.getImage()); 
                
//                request.getRequestDispatcher("/MemberCenterController").forward(request, response); 
			}         
			rtnMap.put("msg", "登入成功!");
		}
		return rtnMap;  
	}
	
	
}
