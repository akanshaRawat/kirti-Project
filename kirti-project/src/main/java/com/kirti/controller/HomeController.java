package com.kirti.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "login.jsp";
	}
	
	@RequestMapping("/getLoginData")
	public String getData(HttpServletRequest req) {
		
		String username=req.getParameter("username");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String password=req.getParameter("password");
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		session.setAttribute("password", password);
		
		
		return "home.jsp";
		
	}

}
