package com.JenelleHanson.relations.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.JenelleHanson.relations.models.License;
import com.JenelleHanson.relations.models.Person;
import com.JenelleHanson.relations.services.LicenseService;
import com.JenelleHanson.relations.services.PersonService;

@Controller
public class HomeController {
	@Autowired
	private final PersonService pService;
	private final LicenseService lService;
	
	public HomeController(PersonService pService, LicenseService lService) {
		this.pService = pService;
		this.lService = lService;
	}
	//Person info
	@GetMapping("/persons/new")
	public String newUser(@ModelAttribute("person") Person person) {
		return "newUser.jsp";
	}
	
	@PostMapping("/persons/new")
	public String addUser(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/newUser.jsp";
		}
		this.pService.concievePerson(person);
		return "redirect:/licenses/new";
	}
	
	
	//License info
	@GetMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", pService.allPersons());//This is to flit through the for each loop
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/newLicense.jsp";
		}
		this.lService.createLicense(license);
		return "redirect:/showId";
	}
	
	
	//Combined
	@GetMapping("/showId")
	public String showId(Model model) {
		model.addAttribute("person", pService.findPerson(null));
		model.addAttribute("license", lService.findLicense(null));
		return "showId.jsp";
	}
}
