package com.yurucamp.mallSystem.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yurucamp.mallSystem.model.ProductBean;
import com.yurucamp.mallSystem.model.service.ProductService;

@Controller
public class Productcontroller {

	@Autowired
	ProductService productService;
	


	// 後臺首頁
	@RequestMapping(value = "/Product/Index", method = RequestMethod.GET)
	public String ProductIndext() {
		return "mallSystemViewPage";
	}

	// 後臺商品列表
	@RequestMapping(value = "/Product/GetAllProduct", method = RequestMethod. GET)
	public String GetAllProduct() throws SQLException {
		List<ProductBean> list = productService.queryAll();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("productBeans", list);
	

	return"mallSystemGetallproduct";
}

}
