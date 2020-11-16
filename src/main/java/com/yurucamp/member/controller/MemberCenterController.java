package com.yurucamp.member.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberCenterDao;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
@SessionAttributes({"memberId","memberRolse"})
public class MemberCenterController {

	@Autowired
	MemberCenterService service ;

//		// YuruCamp首頁連結會員中心
//		@GetMapping("/Member/MemberCenter")
//		public String MemberCenter() {			
//			return "MemberViewPage";
//		}
	// 開啟會員中心前要先拉出資料庫資料

	@GetMapping("/Member/MemberCenter")
	public String MemberCenter(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		MemberBean mb = new MemberBean();
		String memberId = (String) session.getAttribute("memberId");
		mb = service.queryMem(memberId); 
		model.addAttribute("MemberBean", mb);
		//mb以MemberBean傳到前端
//		System.out.println("ControllermemberId="+memberId);
//		System.out.println("Controllci="+ci);
		System.out.println(mb.getMemberId());
		return "MemberViewPage";
	}
	
}
