package com.yurucamp.camp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ajax/CampSite")
public class AjaxController {

//	@Autowired
//	UserService userService;  
	  
	  @GetMapping(value="/all", produces="application/json")
	  public String getUserJson(Model model){
	    return "";
	  }

}
