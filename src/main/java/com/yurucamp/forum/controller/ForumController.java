package com.yurucamp.forum.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.yurucamp.forum.model.PostBean;
import com.yurucamp.forum.model.service.PostService;

@Controller
//@RequestMapping("/Forum")
public class ForumController {
	
	@Autowired
	PostService service;

	@GetMapping("/Forum/Index")
	public String ToClassifyPage() {
//		return "Forum/forumIndex";
		return "ClassifyPage";
	}

	@GetMapping("/Forum/forumIndex")
	public String ToCampDiscussionPage(Model model) {
		
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}


	
	@RequestMapping(value ="/Forum/pureInsert", method = RequestMethod.GET)
	public String PureInsert(Model model) {
		PostBean po = new PostBean();
		String a = "aaa";
		model.addAttribute("ForumBean",a);
		model.addAttribute("PostBean",po);
//		return "Forum/memberCreat";
		return "memberCreatPage";
	}
	
	@RequestMapping(value ="/Forum/insert", method = RequestMethod.POST)
	public String Insert(@ModelAttribute("PostBean")PostBean po,BindingResult result, Model model) 
		throws SQLException {
		service.insertPost(po);
		
		System.out.println("Already Save Object.id = " + po.getPoId());
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}
	
	
	
	@RequestMapping(value ="/Forum/readArticle", method = RequestMethod.GET )
	public String Read(Model model) throws SQLException{
		PostBean po = new PostBean();
		int id =1;
		po = service.read(id);
		model.addAttribute("PostBean", po);
	
		return "memberReadPage";
	}

	
	
	
	
	
	
	
	
	
}