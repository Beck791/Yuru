package com.yurucamp.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginOutController  extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@GetMapping("/Member/LoginOut")
	public String ddd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);//防止建立Session
		if(session == null){
//			response.sendRedirect("/WEB-INF/pages/Index/index.jsp");
//			return "YuruPage";
			 
		}
		
		session.removeAttribute("memberId");
//		response.sendRedirect("/WEB-INF/pages/Index/index.jsp");
		return "YuruPage";
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response); 
    }

}
