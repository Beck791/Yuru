package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.ShoppingCart;
import com.yurucamp.mallsystem.model.service.OrderBeanService;
import com.yurucamp.mallsystem.model.service.OrderDetailBeanService;
import com.yurucamp.mallsystem.model.service.PorductService;
import com.yurucamp.mallsystem.model.service.ShoppingCartService;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
public class ShoppingCartController {

	@Autowired
	MemberCenterService service ;
	
	@Autowired
	OrderBeanService orderBeanService;
	
	@Autowired
	OrderDetailBeanService orderDetailBeanService;
	
	@Autowired
	ShoppingCartService shoppingCartService;
	
	@Autowired
	PorductService productService;
	
	@GetMapping("/shoppingcart")
	public String shopcart(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		Integer memberId = (Integer) session.getAttribute("id");
		System.out.println(memberId);
		List<ShoppingCart> list = shoppingCartService.queryAll(memberId);
		System.out.println(list);
		 List<ProductBean> productBeanlist = null ;
		model.addAttribute("carts", list);
		for (ShoppingCart shoppingCart : list) {
			Integer productid = shoppingCart.getProductId();
		 productBeanlist = (List<ProductBean>) productService.queryOne(productid);
			}
		
		System.out.println(productBeanlist);

//		List<ProductBean> pblist = new List<>()
//		List<ProductBean> productBeanlist = new ArrayList<>(); 	
		
//		for (ProductBean productBean : productBeanlist) {
//			model.addAttribute("productBean",productBean);
//			
//		}
		model.addAttribute("productBeans", productBeanlist);
		return "cart";
		
	}
	@GetMapping("/shoppingcart/addProduct")
	public String addshopcart(@RequestParam("id") Integer id,HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("id");
		ShoppingCart cart = new ShoppingCart();
		shoppingCartService.insert(id);
//		if (shoppingCartService.idExists(cart.getQuantity()));
		return "mallSystemIndex";
		
	}
	@GetMapping("/shoppingcart/updateProduct")
	public String updateProduct(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("id");
		
		return memberId;	
	}
	@GetMapping("/shoppingcart/deleteProduct")
	public String deleteProduct(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("id");
		
		return memberId;	
	}
	
	 @GetMapping(value = "/ordernow/{id}")
	 public String ordernow(@PathVariable(value = "id") int id, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberId");
		



	  return "cart"; // page name
	 }
}

//	@GetMapping("/chooseFilm")
//	@ResponseBody
//	public String chooseFilm(HttpServletRequest request, Model model, Integer movieId) {
//		JSONObject json = new JSONObject();
//		try {
//			if (request.getSession().getAttribute("MemberBean") == null
//					&& request.getSession().getAttribute("MemberBean") == null) {
//				json.put("code", 202);
//			} else {
////				Long count = screenService.getMovieScreenCount(movieId);
////				if (count <= 0) {
//					if(true) {
//					json.put("code", 201);
//					json.put("msg", "庫存不足");
//				} else {
//					json.put("code", 200);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			json.put("code", 500);
//			json.put("msg", "稍後再做嘗試");
//		}
//		return json.toString();
//	}