package com.yurucamp.member.controller;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.dao.MemberCenterDao;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
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
	public String MemberCenter(Model model) throws SQLException {
		MemberBean mb = new MemberBean();
		String memberId = "abc123";
		mb = service.queryMem(memberId);
		model.addAttribute("MemberBean", mb);
		//mb以MemberBean傳到前端
//		System.out.println("ControllermemberId="+memberId);
//		System.out.println("Controllci="+ci);
		System.out.println(mb.getMemberId());
		return "MemberViewPage";
	}
}
