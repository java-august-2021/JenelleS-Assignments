package com.JenelleHanson.TVshowDatabase.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.JenelleHanson.TVshowDatabase.models.Rating;
import com.JenelleHanson.TVshowDatabase.models.Show;
import com.JenelleHanson.TVshowDatabase.models.User;
import com.JenelleHanson.TVshowDatabase.services.CombinedService;
import com.JenelleHanson.TVshowDatabase.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private CombinedService cServ;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.cServ.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/shows";//change*************
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttr, HttpSession session) {
		if(!this.cServ.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		
		User user = this.cServ.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/shows";//change****************
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//Dashboard
	@GetMapping("/shows")
	public String dashboard(Model model, @ModelAttribute("show") Show show, HttpSession session) {
		model.addAttribute("user", this.cServ.findUser((Long)session.getAttribute("user__id")));
		model.addAttribute("allShows", this.cServ.allShows());
		return "dashboard.jsp";
	}
	
	@GetMapping("/shows/new")
	public String newShow(Model model, @ModelAttribute("show") Show show) {
		model.addAttribute("allShows", this.cServ.allShows());
		return "new.jsp";
	}
	
	@PostMapping("/shows/new")
	private String sendNewShow(@Valid @ModelAttribute("show") Show show, BindingResult result,@ModelAttribute("rating") Rating rating, Model model, HttpSession session) {
		Long userId = (Long)session.getAttribute("user__id");
		User loggedInUser = this.cServ.findUser(userId);
		if(result.hasErrors()) {
			model.addAttribute("user", loggedInUser);
			model.addAttribute("allShows", this.cServ.allShows());
			return "new.jsp";
		}
		show.setUser(loggedInUser);
		rating.setRate(0);
		this.cServ.createShow(show);
		return "redirect:/shows";
	}
	
	@GetMapping("/shows/{id}")
	public String show(@PathVariable("id") Long id, Model model, HttpSession session) {
		model.addAttribute("thisShow", this.cServ.findShow(id));
		model.addAttribute("user", this.cServ.findUser((Long)session.getAttribute("user__id")));
		return "display.jsp";
	}
	
	@GetMapping("/shows/{id}/edit")
	public String editIdea(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisShow", this.cServ.findShow(id));
		return "edit.jsp";
	}
	
	//put must have an input hidden method on the edit jsp page and the hidden method true in the app/properties page
	@PostMapping("/shows/{id}/edit") //can use a post mapping looks similar to earlier one
	public String editIdea(@Valid @ModelAttribute("show") Show show, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session) {
		if(result.hasErrors()) {
			model.addAttribute("user", this.cServ.findUser((Long)session.getAttribute("user__id")));
			model.addAttribute("thisShow", this.cServ.findShow(id));
			return "edit.jsp";
		}
		this.cServ.updateShow(show);
		return "redirect:/shows/{id}";
	}
	
	@RequestMapping("/shows/delete/{id}")
	public String deleteIdea(@PathVariable("id") Long id) {
		this.cServ.deleteShow(id);
		return "redirect:/shows";
	}
}
