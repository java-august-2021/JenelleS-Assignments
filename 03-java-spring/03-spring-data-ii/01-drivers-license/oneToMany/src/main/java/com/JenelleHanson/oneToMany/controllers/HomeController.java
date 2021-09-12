package com.JenelleHanson.oneToMany.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.JenelleHanson.oneToMany.models.Dojo;
import com.JenelleHanson.oneToMany.models.Ninja;
import com.JenelleHanson.oneToMany.services.DojoService;
import com.JenelleHanson.oneToMany.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	private final DojoService dSer;
	private final NinjaService nSer;
	
	//constructor
	public HomeController(DojoService dSer, NinjaService nSer) {
		this.dSer = dSer;
		this.nSer = nSer;
	}
	
	//dojo creation page and info
	@GetMapping("/dojos")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
		model.addAttribute("allDojos", this.dSer.allDojos());
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String addNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "/newDojo.jsp";
		}
		this.dSer.createDojo(dojo);
		return "redirect:/ninjas";
	}
	//ninja creation page and info
	@GetMapping("/ninjas")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", this.dSer.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String addNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "/newNinja.jsp";
		}
		Ninja newNinja = this.nSer.createNinja(ninja);
		Dojo dojo = newNinja.getDojo();
		Long getDojoId = dojo.getId();
		return "redirect:/dojos/" + getDojoId;
	}
	
	//combined
	@GetMapping("/dojos/{id}")
	public String dashboard(@PathVariable("id") Long id,Model model) {
		model.addAttribute("allNinjas", nSer.allNinjas());
		model.addAttribute("dojo", dSer.findDojo(id));
		return "main.jsp";
	}
	

}
