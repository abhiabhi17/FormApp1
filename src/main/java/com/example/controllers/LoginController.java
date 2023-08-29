package com.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.pojo.Login;
import com.example.service.StudentService;

@Controller
public class LoginController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("login",new Login());
		return "loginform";
	}

	@RequestMapping(value="/loginForm",method=RequestMethod.POST)
	public String successLogin(Model model,@ModelAttribute("login")Login login,
			HttpServletRequest request,HttpServletResponse Response) {
		
		HttpSession session=request.getSession();
		session.setAttribute("name", login.getUname());
		if(login.getUname().equals("abhi") && login.getPwd().equals("abhi"))
			
		{
			model.addAttribute("msg","Hi"+login.getUname()+ "please register the form");
			model.addAttribute("genders",service.getGenders());
			model.addAttribute("courses",service.getCourses());
			model.addAttribute("qualifications",service.getQualifications());
			return "regform";
		}
		else
		{
				 model.addAttribute("error", "Invalid Details");
				 
				return "Invalidloginform";
			
		}
		
			
		
	}
}
