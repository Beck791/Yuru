package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.ShoppingCart;
import com.yurucamp.mallsystem.model.service.OrderBeanService;
import com.yurucamp.mallsystem.model.service.OrderDetailBeanService;
import com.yurucamp.mallsystem.model.service.PorductService;
import com.yurucamp.mallsystem.model.service.ShoppingCartService;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
@SessionAttributes({"memberBean" ,"id", "ShoppingCart" })
public class ShoppingCartController {

	@Autowired
	MemberCenterService service;

	@Autowired
	OrderBeanService orderBeanService;

	@Autowired
	OrderDetailBeanService orderDetailBeanService;

	@Autowired
	ShoppingCartService shoppingCartService;

	@Autowired
	PorductService productService;

	@GetMapping("/shoppingcart")
	public String shopcart(Model model, SessionStatus status) throws SQLException {
			MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
			if (memberBean == null) {
				status.setComplete();
				return "/";
			}
			return  "cart";
		}

	@PostMapping("/shoppingcart/addProduct")
	public String addshopcart(@RequestParam("id") Integer productId, Model model,HttpServletRequest request) throws SQLException {
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
		if (memberBean == null) {
			return "/";
		}

		HttpSession session = request.getSession(false);
		if (session == null) {
			return "/";
		}

		// 取出存放在session物件內的ShoppingCart物件
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		// 如果找不到ShoppingCart物件
		if (cart == null) {
			// 新建ShoppingCart物件
			cart = new ShoppingCart();
			// 並將此新建ShoppingCart的物件放到session物件內，成為它的屬性物件
			model.addAttribute("ShoppingCart", cart);
		}
		Map<Integer, ProductBean> productMap =productService.queryallon();
		ProductBean productBean = productMap.get(productId);
		OrderBean orderbean = new OrderBean();
		
//		null, bookId, productBean.getDescription(), qty, productBean.getPrice(),
//				, productBean.getBrand(),productBean.getName());
		// 將OrderItem物件內加入ShoppingCart的物件內
		cart.addToCart(productId, orderbean);
		return "mallSystemIndex";

	}

	@GetMapping("/shoppingcart/updateProduct")
	public String updateProduct(@RequestParam("cmd")   String cmd,  
			@RequestParam(value = "prodcutId", required = false) Integer  prodcutId, 
			@RequestParam(value = "qty", required = false) Integer  qty, 
			Model model, SessionStatus status) {
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		if (cart == null) {
			status.setComplete();
			return "/";
		}
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
//		memberBean = null;     // 此敘述測試用
		if (memberBean == null) {
			status.setComplete();
			return "/";
		}
		if (cmd.equalsIgnoreCase("DEL")) {
			cart.deleteProduct(prodcutId); // 刪除購物車內的某項商品
		    return "cart";
		} else if (cmd.equalsIgnoreCase("MOD")) {
			cart.modifyQty(prodcutId, qty);   // 修改某項商品的數項
		    return "cart";
		} else {
			return "cart";
		}

	}
	

	@GetMapping("/shoppingcart/deleteProduct")
	public String deleteProduct(HttpServletRequest request, Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberBean");

		return memberId;
	}

	@GetMapping(value = "/ordernow/{id}")
	public String ordernow(@PathVariable(value = "id") int id, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberBean");

		return "cart"; // page name
	}

}
