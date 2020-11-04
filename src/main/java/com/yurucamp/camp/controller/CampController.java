package com.yurucamp.camp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CampSite")
public class CampController {

	@GetMapping("/Index")
	public String campIndex() {
		return "CampSite/campSiteIndex";
	}

}
