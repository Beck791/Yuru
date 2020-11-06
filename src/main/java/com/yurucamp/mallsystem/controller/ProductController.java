package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yurucamp.mallsystem.model.BrandBean;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.service.BrandService;
import com.yurucamp.mallsystem.model.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	// 商城首頁
	@RequestMapping(value = "/Product/Index", method = RequestMethod.GET)
	public String ProductIndex() {
		return "mallSystemIndex";
	}

	// 後臺首頁
	@RequestMapping(value = "/Product/BackStageIndex", method = RequestMethod.GET)
	public String ProductBackStageIndex() {
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
	public String InsertProduct(@RequestParam("name") String name, @RequestParam("brandId") String brandId,
			@RequestParam("price") Integer price, @RequestParam("image") String image,
			@RequestParam("webTraffic") Integer webTraffic, @RequestParam("description") String description,
			@RequestParam("statusId") Integer statusId, @RequestParam("stock") Integer stock,
			@RequestParam("category") String category, @RequestParam("createtime") Date createtime, Model model)
			throws SQLException {

		List<ProductBean> list = productService.queryAll();
		model.addAttribute("productBeans", list);
		return "mallSystemInsertProduct";
	}

	@RequestMapping(value = "/Product/GetAllBrand", method = RequestMethod.GET)
	public String GetAllBrand(Model model) throws SQLException {
//		List<BrandBean> list = brandService.querypage();
		List<BrandBean> list = brandService.queryAll();
		model.addAttribute("brandBeans", list);
		return "mallSystemGetAllBrand";
	}

	@RequestMapping(value = "/Product/InsertBrand", method = RequestMethod.GET)
	public String InsertBrand() {
		return "mallSystemInsertBrand";
	}

	@RequestMapping(value = "/Product/InsertBrandinfo", method = RequestMethod.POST)
	public String InsertBrandinfo(@RequestParam("name") String name, Model model) throws SQLException {
		BrandBean brandBean = new BrandBean();
		brandBean.setName(name);
		brandBean.setCreatetime(new Timestamp(System.currentTimeMillis()));
		brandService.insert(brandBean);
		List<BrandBean> list = brandService.querypage();
		model.addAttribute("brandBeans", list);
//		model.addAttribute("brandBean",brandBean);
//		model.addAttribute("createtime",brandBean);
//		model.addAttribute("updatetime",timenowupdate);
//	
//		System.out.println(brandBean.setCreatetime(new Timestamp(System.currentTimeMillis())));
		return "mallSystemInsertBrand";
	}

	@RequestMapping(value = "/Product/UpdateBrand", method = RequestMethod.GET)
	public String UpdateBrand(@RequestParam("id") String name, Model model) {
		return "mallSystemUpdateBrand";
	}

	@RequestMapping(value = "/Product/UpdaeBrand", method = RequestMethod.GET)
	public String UpdateBrand(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("updatetime") Timestamp updatetime, Model model) {
		BrandBean brandBean = new BrandBean();
		try {
			brandService.update(brandBean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		model.addAttribute("brandBean", brandBean);

		return "mallSystemUpdateBrand";
	}

	@RequestMapping(value = "/Product/DeleteBrand", method = RequestMethod.POST)
	public String DeleteBrand(@RequestParam("id") Integer id, Model model)
			throws SQLException {
		brandService.deleteOne(id);
		List<BrandBean> list = brandService.queryAll();
		model.addAttribute("brandBeans", list);
		return "mallSystemGetAllBrand";
	}

}
