package com.yurucamp.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Forum")
public class ForumController {
	
	@GetMapping("/Index")
	public String forumIndex() {
		return "Forum/forumIndex";
	}
	
	
	@GetMapping("/forumIndex")
	public String memberCreat() {
		return "Forum/memberCreat";
	}
	
}