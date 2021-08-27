package com.JenelleHanson.Survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/result")
	public String showResult(HttpSession session, Model model) {//when submitting information through a form you need a session of getter and setters
		String name = (String) session.getAttribute("name");
		String location = (String)session.getAttribute("location");
		String language = (String)session.getAttribute("language");
		String comment = (String)session.getAttribute("comment");		
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
	
	@RequestMapping(path="/submit", method=RequestMethod.POST)//MUST ALWAYS HAVE A GET MAPPING WITH A POST MAPPING!!!!
	public String submit(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
}
