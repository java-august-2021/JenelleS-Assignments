package com.JenelleHanson.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(HttpSession session) {
		Integer currentCount = (Integer) session.getAttribute("count");
		if(session.getAttribute("count")== null) {
			session.setAttribute("count", 0);
		} else {
			session.setAttribute("count", ++currentCount);
		}
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}
}
