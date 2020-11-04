package com.yurucamp.backstage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yurucamp.backstage.model.Test;
import com.yurucamp.backstage.service.BackstageService;

@Controller
@RequestMapping("/Backstage")
public class BackstageController {
	
	@Autowired
	BackstageService backstageService;
	
	@GetMapping("/index")
	public String backstageIndex() {
		return "Backstage/index";
	}
	
	@GetMapping("/member")
	public String backstageMemberIndex() {
		return "Backstage/member";
	}
	
	@GetMapping("/camp")
	public String backstageCampIndex() {
		return "Backstage/camp";
	}
	
	@GetMapping("/forum")
	public String backstageForumIndex() {
		List<Test> products = backstageService.getAllProducts();
		
		for(Test s:products) {
			System.out.println("test"+s.getName());
		}
		return "Backstage/forum";
	}
	
	
	
}
