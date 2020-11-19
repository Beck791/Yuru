package com.yurucamp.camp.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yurucamp.camp.model.CampInfo;
import com.yurucamp.camp.model.service.CampService;

@Controller
public class CampController {

	@Autowired
	CampService service;

	@GetMapping("/CampSite/Index")
	public String campIndex() {
//		return "CampSite/campSiteIndex";
		return "CampSiteIndex";
	}

	@PostMapping("/CampSite/Insert") // 新增
	public String InsertCamp(@ModelAttribute("campInfo") CampInfo ci, BindingResult result, Model model)
			throws SQLException {
		ci.getCampDetail();
		service.saveCamp(ci);
		System.out.println("Already Save Object.id = " + ci.getName());
		return "QueryOneCamp";
	}

	@GetMapping("/CampSite/PureInsert") // 新增前置作業
	public String PureInsert(Model model) {
		CampInfo ci = new CampInfo();
		model.addAttribute("campInfo", ci);
		return "InsertCamp";
	}

	@GetMapping("/CampSite/QueryOne")
	public String QueryOne(Model model) throws SQLException {
		CampInfo ci = new CampInfo();
		int id = 2;
		ci = service.queryCamp(id);
		model.addAttribute("campInfo", ci);
		return "QueryOneCamp";
	}

	@GetMapping("/CampSite/DeleteOne")
	public String DeleteOne(Model model) throws SQLException {
		int id = 1;
		service.deleteCamp(id);
		return "CampSiteIndex";
	}

	@GetMapping("/CampSite/QueryAllCamp")
	public String QueryAllCamp(Model model) throws SQLException {
		List<CampInfo> list = service.queryAllCamp();
		model.addAttribute("campInfo", list);
		return "QueryAllCamp";
	}

	@GetMapping("/CampSite/Test")
	public String Test(Model model) throws SQLException {
		return "Test";
	}

	@GetMapping("/CampSite/TestOne")
	public String Test1() throws SQLException {
		return "TestOne";
	}

	@GetMapping("/CampSite/Mail")
	public String Mail() throws SQLException {
		service.sendRegistEmail();
		return "Test";
	}

}
