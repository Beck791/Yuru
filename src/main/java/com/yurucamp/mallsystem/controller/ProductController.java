package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
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

	// 後臺新增商品頁面
	@RequestMapping(value = "/Product/InsertProduct", method = RequestMethod.GET)
	public String InsertProductinfo()  {
		return "mallSystemInsertProduct";
	}	
	// 後臺新增商品資料
	@RequestMapping(value = "/Product/InsertProductinfo", method = RequestMethod.POST)
	public String InsertProduct(@RequestParam("name") String name,
								@RequestParam("brand") String brandname,
								@RequestParam("price") Integer price,
								@RequestParam("image") String image,
								@RequestParam("description") String description,
								@RequestParam("status") String status,
								@RequestParam("stock") Integer stock,
								@RequestParam("category") String category, Model model)throws SQLException {
		ProductBean productBean = new ProductBean();
		productBean.setName(name);
		productBean.setBrandId(brandService.queryId(brandname));
		productBean.setPrice(price);
		productBean.setImage(image);
		productBean.setDescription(description);
		productBean.setStatusId(productService.queryId(status));
		productBean.setStock(stock);
		productBean.setCategory(category);
		productBean.setCreatetime(new Timestamp(System.currentTimeMillis()));
		productService.insert(productBean);
		
		return "mallSystemInsertProduct";
	}
	// 後臺查詢所有商品
	@RequestMapping(value = "/Product/GetAllBrand", method = RequestMethod.GET)
	public String GetAllBrand(Model model) throws SQLException {
//		List<BrandBean> list = brandService.querypage();
		List<BrandBean> list = brandService.queryAll();
		model.addAttribute("brandBeans", list);
		return "mallSystemGetAllBrand";
	}
	// 後臺新增廠牌頁面
	@RequestMapping(value = "/Product/InsertBrand", method = RequestMethod.GET)
	public String InsertBrand() {
		return "mallSystemInsertBrand";
	}
	// 後臺新增廠牌
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
	
	// 後臺修改廠牌頁面
	@RequestMapping(value = "/Product/UpdateBrand", method = RequestMethod.POST)
	public String UpdateBrand(@RequestParam("id") Integer id, Model model) throws SQLException {
		BrandBean brandBean = new BrandBean();
		brandBean = brandService.queryOne(id);
		model.addAttribute("brandBean", brandBean);
		
		return "mallSystemUpdateBrand";
	}
	
	// 後臺修改廠牌
	@RequestMapping(value = "/Product/UpdateBrandinfo", method = RequestMethod.POST)
	public String UpdateBrand(@RequestParam("id") Integer id, @RequestParam("name") String name,Model model) throws SQLException {
		BrandBean brandBean = new BrandBean();		
		brandBean.setId(id);
		brandBean.setName(name);
		brandBean.setUpdatetime(new Timestamp(System.currentTimeMillis()));
		brandService.update(brandBean);
		brandBean = brandService.queryOne(id);
		
		model.addAttribute("brandBeaninfo", brandBean);

		return "mallSystemUpdateBrand";
	}
	
	// 後臺刪除廠牌
	@RequestMapping(value = "/Product/DeleteBrand", method = RequestMethod.POST)
	public String DeleteBrand(@RequestParam("id") Integer id, Model model)
			throws SQLException {
		brandService.deleteOne(id);
		List<BrandBean> list = brandService.queryAll();
		model.addAttribute("brandBeans", list);
		return "mallSystemGetAllBrand";
	}

}
