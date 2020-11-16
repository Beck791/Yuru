package com.yurucamp.mallsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yurucamp.member.model.service.MemberCenterService;

import net.sf.json.JSONObject;

@Controller
public class ShoppingCartController {

	@Autowired
	MemberCenterService service ;
	
	@GetMapping("/chooseFilm")
	@ResponseBody
	public String chooseFilm(HttpServletRequest request, Model model, Integer movieId) {
		JSONObject json = new JSONObject();
		try {
			if (request.getSession().getAttribute("MemberBean") == null
					&& request.getSession().getAttribute("MemberBean") == null) {
				json.put("code", 202);
			} else {
//				Long count = screenService.getMovieScreenCount(movieId);
//				if (count <= 0) {
					if(true) {
					json.put("code", 201);
					json.put("msg", "庫存不足");
				} else {
					json.put("code", 200);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.put("code", 500);
			json.put("msg", "稍後再做嘗試");
		}
		return json.toString();
	}
	
	
	
	
}
