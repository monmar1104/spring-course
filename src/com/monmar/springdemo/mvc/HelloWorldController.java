package com.monmar.springdemo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShouldDudeThree(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		String upperCaseName = "Yo!: "+theName.toUpperCase();
		model.addAttribute("message", upperCaseName);
		return "helloworld";
	}
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String letsShouldDude(@RequestParam("studentName") String name, Model model) {
		
		String upperCaseName = "Yo!: "+name.toUpperCase();
		model.addAttribute("message", upperCaseName);
		return "helloworld";
	}
	

}
