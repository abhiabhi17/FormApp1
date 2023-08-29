package com.example.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.pojo.Student;
import com.example.service.StudentService;

@Controller
@RequestMapping("/display")
public class StudentController {
	
	@Autowired
	private StudentService service;

	@RequestMapping("/reg")
	public String displayForm(Model model)
	{
		formValues(model);
		return "regform";
		
	}

	private void formValues(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("student",new Student());
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("qualification",service.getQualifications());
		model.addAttribute("genders",service.getGenders());
		
	}
	
	@RequestMapping(value="/formSubmit",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("student")Student s,ModelMap model,
			                   RedirectAttributes attributes,HttpServletRequest request,HttpServletResponse Response) {
		
		attributes.addFlashAttribute("msg","SuccessfullyRegistered");
		model.addAttribute("id",s.getId());
		model.addAttribute("name",s.getName());
		model.addAttribute("phno",s.getPhno());
		model.addAttribute("genders",s.getGender());
		model.addAttribute("qualification",s.getQualification());
		model.addAttribute("courses",s.getCourses());
		
		service.save(s);
		return "regform";
		
	}
}
