package com.JenelleHanson.YogaSite.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.JenelleHanson.YogaSite.models.User;
import com.JenelleHanson.YogaSite.services.UserService;
import com.JenelleHanson.YogaSite.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService uServ;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		return "dashboard.jsp";
	}
	
	@GetMapping("/main")
	public String dashRender(@ModelAttribute("user") User user) {
		return "main.jsp";
	}
	
	@PostMapping("/registerChk")
	public String registerChk(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.uServ.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/main";//change************* next page after login
	}
	
	@PostMapping("/loginChk")
	public String loginChk(@RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttr, HttpSession session) {
		if(!this.uServ.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/index";
		}
		
		User user = this.uServ.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/main";//change**************** next page
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
//	@GetMapping("/meditate")
//	public String dashboard(Model model, HttpSession session) {
//		model.addAttribute("user", this.uServ.findUser((Long)session.getAttribute("user__id")));
//		return "main.jsp";
//	}
}
