package com.yurucamp.backstage.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.yurucamp.backstage.model.Test;
import com.yurucamp.backstage.service.BackstageService;
import com.yurucamp.member.model.MemberBean;

@Controller
@RequestMapping("/Backstage")
public class BackstageController {
	
	@Autowired
	BackstageService backstageService;
	
	
	
//	@Autowired
//	MemberService memberService;
	
	@GetMapping("/index")
	public String backstageIndex() {
//		return "Backstage/index";
		return "backstageViewPage";
	}
	
	@GetMapping("/member")
	public String backstageMemberIndex() {
		return "backstageMemberViewPage";
	}
	
	@GetMapping("/camp")
	public String backstageCampIndex() {
		return "Backstage/camp";
	}
	
	@GetMapping("/forum")
	public String backstageForumIndex() throws SQLException {
		List<Test> products = backstageService.getAllProducts();
		
		for(Test s:products) {
			System.out.println("test"+s.getName());
		}
		return "backstageForumViewPage";
	}
	
	@GetMapping("/calendar")
	public String backstageCalendarIndex() throws SQLException {
		
		return "backstageCalendarViewPage";
	}
	
	@PostMapping("/memberSearc")
	@ResponseBody
	public String backstageMemberSearc(Model model,String Account) throws SQLException {
		List<MemberBean> memberData = backstageService.getMember(Account);
		String json = JSONArray.toJSONString(memberData);
		
		return json;
	}
	
	
	
}
