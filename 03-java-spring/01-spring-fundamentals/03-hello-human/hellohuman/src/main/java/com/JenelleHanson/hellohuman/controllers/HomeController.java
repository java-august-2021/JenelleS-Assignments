package com.JenelleHanson.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
		@RequestMapping("/")//connects to the webpage
		public String index(@RequestParam(value="q", required=false, defaultValue = "Human") String searchQuery, Model model) {
			model.addAttribute("search", searchQuery);/*connects to the c:out in the jsp page*/
			return "index.jsp";//returns the jsp page
		}			
}
