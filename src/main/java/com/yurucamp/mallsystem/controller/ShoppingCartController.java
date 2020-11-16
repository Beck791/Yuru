package com.yurucamp.mallsystem.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yurucamp.mallsystem.model.service.OrderBeanService;
import com.yurucamp.mallsystem.model.service.OrderDetailBeanService;
import com.yurucamp.member.model.service.MemberCenterService;

@Controller
public class ShoppingCartController {

	@Autowired
	MemberCenterService service ;
	
	@Autowired
	OrderBeanService orderBeanService;
	
	@Autowired
	OrderDetailBeanService orderDetailBeanService;

	
	@GetMapping("/shoppingcart/addProduct")
	public String addshopcart(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberId");

		return memberId;	
	}
	@GetMapping("/shoppingcart/updateProduct")
	public String updateProduct(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberId");
		
		return memberId;	
	}
	@GetMapping("/shoppingcart/deleteProduct")
	public String deleteProduct(HttpServletRequest request,Model model) throws SQLException {
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("memberId");
		
		return memberId;	
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