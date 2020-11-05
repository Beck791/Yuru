package com.yurucamp.camp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.camp.model.service.CampService;

@Controller
public class CampController {

	@GetMapping("/CampSite/Index")
	public String campIndex() {
//		return "CampSite/campSiteIndex";
		return "CampViewPage";
	}
	
	@GetMapping("/CampSite/Index/Insert")
	public String campIndexInsert() {
		return "InsertCamp";
	}

	@PostMapping("/CampSite/Insert")
	public String InsertCamp(Model model,
//			@RequestParam String name,
//			@RequestParam String address,
//			@RequestParam Integer altitude,
//			@RequestParam String owner,
//			@RequestParam String ownerPhone
			@RequestBody CampInfo ci) {
		System.out.println(ci);
//		CampInfo ci = new CampInfo(null, name,address,altitude,owner,ownerPhone);
//		CampInfo re = CampService;
		return "CampViewPage";
	}
}
