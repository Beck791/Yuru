package com.yurucamp.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@SessionAttributes({"memberId","memberRolse"})
public class LoginOutController  extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@GetMapping("/Member/LoginOut")
	public String ddd(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);//防止建立Session
		
			session.removeAttribute("memberId");
			session.removeAttribute("memberRolse");
			session.removeAttribute("memberPaid");
		return "indexPage";
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response); 
    }

}
