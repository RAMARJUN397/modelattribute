package com.spring.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginControllers {
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(HttpServletRequest req,Model m) {
		
		String name=req.getParameter("uname");
		String p=req.getParameter("pwd");
		if((name.equals("arjun"))&&((p.equals("Arjun@397")))){
			
			String h="Welcome Arjun";
			m.addAttribute("msg", h);
			
			return"successs";
		}
		else {
			return"error";
		}
	}

}
