package com.yurucamp.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/Forum")
public class ForumController {

	@GetMapping("/Forum/Index")
	public String forumIndex() {
//		return "Forum/forumIndex";
		return "forumIndexPage";
	}

	@GetMapping("/Forum/forumIndex")
	public String campDiscussion() {
//		return "Forum/memberCreat";
		return "campDiscussionPage";
	}

	@GetMapping("/Forum/creatArticle")
	public String memberCreat() {
//		return "Forum/memberCreat";
		return "memberCreatPage";
	}
	
	@GetMapping("/Forum/creatArticle")
	public String memberRead() {
//		return "Forum/memberCreat";
		return "memberReadPage";
	}

	
	
	
	
	
	
	
	
}