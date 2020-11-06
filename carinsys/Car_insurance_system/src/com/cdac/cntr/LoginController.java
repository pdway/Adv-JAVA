package com.cdac.cntr;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.dto.Admin;

@Controller
public class LoginController {

	@RequestMapping(value="/login.htm")
	public String validateAdmin(HttpServletRequest req) {
		String name=req.getParameter("AdminName");
		String pass=req.getParameter("AdminPass");
		Admin f=new Admin();
		
		if(f.getUsername().equals(name)&& f.getPassword().equals(pass)) {
			
			return "home";
		}
		else {
			return "index";
		}	
	}
	
	@RequestMapping(value = "/logout.htm")
	public String logout(HttpSession session, HttpServletResponse response) throws IOException {
			session.invalidate();
			response.sendRedirect("index.jsp");
			return null;
		
	}
	
	
}
