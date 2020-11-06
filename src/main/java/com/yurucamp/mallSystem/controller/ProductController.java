package com.yurucamp.mallSystem.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yurucamp.mallSystem.model.BrandBean;
import com.yurucamp.mallSystem.model.ProductBean;
import com.yurucamp.mallSystem.model.service.BrandService;
import com.yurucamp.mallSystem.model.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
	BrandService brandService;

	// 後臺首頁
	@RequestMapping(value = "/Product/Index", method = RequestMethod.GET)
	public String ProductIndext() {
		return "mallSystemViewPage";
	}


	// 後臺商品列表
	@RequestMapping(value = "/Product/GetAllProduct", method = RequestMethod.GET)
	public String GetAllProduct(Model model) throws SQLException {
		List<ProductBean> list = productService.queryAll();
		model.addAttribute("productBeans", list);
		return "mallSystemGetAllProduct";
	}

	// 後臺新增商品
	@RequestMapping(value = "/Product/InsertProduct", method = RequestMethod.POST)
	public String InsertProduct(@RequestParam("name") String name,
								@RequestParam("brandId") String brandId,
								@RequestParam("price") Integer price,
								@RequestParam("image") String image,
								@RequestParam("webTraffic") Integer webTraffic,
								@RequestParam("description") String description,
								@RequestParam("statusId") Integer statusId,
								@RequestParam("stock") Integer stock,
								@RequestParam("category") String category,
								@RequestParam("createtime") Date createtime,
								@RequestParam("updatetime") Date updatetime,Model model) throws SQLException {
		

		List<ProductBean> list = productService.queryAll();
		model.addAttribute("productBeans", list);
		return "mallSystemInsertProduct"; 
	}

	@RequestMapping(value= "/Product/GetAllBrand" , method =RequestMethod.GET )
	public String GetAllBrand(Model model) throws SQLException {
		List<BrandBean> list = brandService.queryAll();
		model.addAttribute("brandBeans", list);
		return "mallSystemGetAllBrand";	
	}
	
	
	@RequestMapping(value= "/Product/InsertBrand" , method =RequestMethod.GET )
	public String InsertBrand() {
		return "mallSystemInsertBrand";
	}
	
	@RequestMapping(value= "/Product/InsertBrandinfo" , method =RequestMethod.POST )
	public String InsertBrandinfo(
			@RequestParam("name") String name,
	 Model model) throws SQLException {
		BrandBean brandBean =  new BrandBean();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//		Date datetimenow = sdf.parse(date);
//		date = sdf.parse(str);
		brandBean.setName(name);
		String timenowcreate = sdf.format(brandBean.setCreatetime(date));	
		String timenowupdate = sdf.format(brandBean.setUpdatetime(date));	
//		brandBean.setCreatetime(date);
//		brandBean.setUpdatetime(date);
		brandService.insert(brandBean);
		
//		brandService.querylast();
		model.addAttribute("brandBean",brandBean);
		model.addAttribute("createtime",timenowcreate);
		model.addAttribute("updatetime",timenowupdate);
	
		System.out.println(sdf.format(brandBean.setCreatetime(date)));
		return "mallSystemInsertBrand";	
	}
	
	
	
}
