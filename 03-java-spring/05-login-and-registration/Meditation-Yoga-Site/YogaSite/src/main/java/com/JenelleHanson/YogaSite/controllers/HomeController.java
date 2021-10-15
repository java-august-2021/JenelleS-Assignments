package com.JenelleHanson.YogaSite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.JenelleHanson.YogaSite.models.User;
import com.JenelleHanson.YogaSite.services.UserService;
import com.JenelleHanson.YogaSite.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService UServ;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
}
