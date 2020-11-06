package com.yurucamp.camp.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.camp.model.service.CampService;

@Controller
public class CampController {

	@Autowired
	CampService service;
	
	@GetMapping("/CampSite/Index")
	public String campIndex() {
//		return "CampSite/campSiteIndex";
		return "CampViewPage";
	}
	
	@GetMapping("/CampSite/Index/Insert")
	public String campIndexInsert() {
		return "InsertCamp";
	}

	@RequestMapping(value="/CampSite/Insert", method = RequestMethod.POST)
	public String InsertCamp(@ModelAttribute("campInfo") CampInfo ci, BindingResult result, Model model) throws SQLException {
		System.out.println(ci.getName());
		service.saveCamp(ci);
		return "CampViewPage";
	}
	
	@RequestMapping(value="/CampSite/PureInsert", method = RequestMethod.GET)
	public String PureInsert(Model model) {
		CampInfo ci = new CampInfo();
		model.addAttribute("campInfo", ci);
		return "PureInsert";
	}
}
