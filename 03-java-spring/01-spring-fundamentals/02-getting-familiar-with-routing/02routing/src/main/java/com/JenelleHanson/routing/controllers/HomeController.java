package com.JenelleHanson.routing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	//1. Annotation
	@RequestMapping("/")//connects to the webpage
	//3. Method that maps to the request route above
	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
		model.addAttribute("search", searchQuery);/*connects to the c:out in the jsp page*/
		return "index.jsp";//returns the jsp page
	}
		
	@RequestMapping("/users/{name}")//{}have to match the path variable name
	public String showName(@PathVariable("name") String userName, Model model) {
		model.addAttribute("userName", userName);//make sure to connect to a c:out!!!!
		return "index.jsp";//connect to appropriate jsp as well!
	}
}
