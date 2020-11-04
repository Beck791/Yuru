package com.yurucamp.mallSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yurucamp.mallSystem.model.service.ProductService;

@Controller
public class Productcontroller {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/ProductIndext", method = RequestMethod.GET)
	public String ProductIndext() {
		return "mallSystemViewPage";
	}
	
	
}
