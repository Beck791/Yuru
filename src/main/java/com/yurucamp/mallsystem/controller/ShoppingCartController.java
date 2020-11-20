package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.yurucamp.mallsystem.model.OrderBean;
import com.yurucamp.mallsystem.model.OrderDetailBean;
import com.yurucamp.mallsystem.model.ProductBean;
import com.yurucamp.mallsystem.model.ShoppingCart;
import com.yurucamp.mallsystem.model.service.OrderBeanService;
import com.yurucamp.mallsystem.model.service.OrderDetailBeanService;
import com.yurucamp.mallsystem.model.service.PorductService;
import com.yurucamp.mallsystem.model.service.ShoppingCartService;
import com.yurucamp.member.model.MemberBean;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
@SessionAttributes({"memberBean" ,"id", "ShoppingCart", })
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
				return "redirectMallSystemIndex";
			}
			ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
			// 如果找不到ShoppingCart物件
			if (cart == null) {
				// 新建ShoppingCart物件
				cart = new ShoppingCart();
				// 並將此新建ShoppingCart的物件放到session物件內，成為它的屬性物件
				model.addAttribute("ShoppingCart", cart);
				return "redirectMallSystemIndex";
			}
			return "cart";
		}

	@PostMapping("/shoppingcart/addProduct")
	public String addshopcart(@RequestParam("id") Integer productId, Model model,HttpServletRequest request,SessionStatus status) throws SQLException {
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
		if (memberBean == null) {
			return "redirectMallSystemIndex";
		}

		HttpSession session = request.getSession(false);
		if (session == null) {
			return "indexPage";
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
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(productId);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		OrderBean orderbean = new OrderBean();
		orderbean.setProductId(productId);
		orderbean.setProductName(productBean.getName());
		
		System.out.println(productBean.getName());
		orderbean.setDescription(productBean.getDescription());
		orderbean.setQuantity(1);
		orderbean.setPrice(productBean.getPrice());
		System.out.println(productBean.getPrice());
		orderbean.setFee(60);
		orderbean.setImage(productBean.getImage());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(productBean.getImage());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(memberBean.getPaid());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		orderbean.setCategory(productBean.getCategory());
//		orderbean.setTotal(cart.getSubtotal());
//		System.out.println(cart.getSubtotal());
		cart.addToCart(productId, orderbean);
		if(memberBean.getPaid() == 1) {
			orderbean.setTotal(cart.getPayFinalSubtotal());	
		}else {
			orderbean.setTotal(cart.getFinalSubtotal());		
		}
		System.out.println(orderbean.getTotal());
		System.out.println(cart.getContent());
		List<ProductBean> list = productService.queryAllon();	
		model.addAttribute("productBeans", list);
		model.addAttribute("ShoppingCart", cart);
		return "mallSystemIndex";

	}

	@RequestMapping(value="/shoppingcart/updateProduct", method= {RequestMethod.GET, RequestMethod.POST})
	public String updateProduct(
			@RequestParam(value = "id", required = false) Integer  prodcutId, 
			@RequestParam(value = "newQty", required = false) Integer  qty, 
			Model model, SessionStatus status) {
		
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
		if (memberBean == null) {
			return "redirectMallSystemIndex";
		}
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		if (cart == null) {
			return "redirectMallSystemIndex";
		}
	  System.out.println("cart=" + cart + ", prodcutId=" + prodcutId + ", QTY=" + qty);
	  		
	  	if(prodcutId!=null || qty!=null) {	  		
	  		cart.modifyQty(prodcutId, qty);   // 修改某項商品的數項
	  	}
		
			model.addAttribute("ShoppingCart", cart);
			return "cart";
	}
	

	@PostMapping("/shoppingcart/deleteProduct")
	public String deleteProduct(@RequestParam("id")Integer productId, Model model,SessionStatus status) throws SQLException {
	
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
		if (memberBean == null) {
			return "mallSystemIndex";
		}
		
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		if (cart == null) {
			return "redirectMallSystemIndex";
		}
		
		cart.deleteProduct(productId);
		
		model.addAttribute("ShoppingCart", cart);
		return "cart";
	}

	@GetMapping(value = "/shoppingcart/insertorder")
	public String insertorder( Model model,SessionStatus status) throws SQLException {
		MemberBean memberBean = (MemberBean) model.getAttribute("memberBean");
		
		if (memberBean == null) {
			return "mallSystemIndex";
		}
		ShoppingCart cart = (ShoppingCart) model.getAttribute("ShoppingCart");
		if (cart == null) {
			return "redirectMallSystemIndex";
		}
		
		
		Map<Integer,OrderBean> orderBeanMap = cart.getContent();
		
		for(Integer key : orderBeanMap.keySet()) {
			OrderDetailBean  orderDetailBean = new OrderDetailBean();
			OrderBean bean = orderBeanMap.get(key);
			bean.setCreateTime(new Timestamp(System.currentTimeMillis()));
			bean.setMemberId(memberBean.getId());
			
			
			orderDetailBean.setId(bean.getId());
			orderDetailBean.setPrice(bean.getPrice());
			orderDetailBean.setCreatetime(new Timestamp(System.currentTimeMillis()));
			orderDetailBean.setProductId(bean.getProductId());
			orderDetailBean.setQuantity(bean.getQuantity());
			
			orderBeanService.insert(bean, orderDetailBean);
			
		}
		model.addAttribute("ShoppingCart", null);
		return "cart"; // page name
	}

}
