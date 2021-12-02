package com.JenelleHanson.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.JenelleHanson.Languages.models.Language;
import com.JenelleHanson.Languages.services.LanguageService;

@Controller
public class HomeController {
	@Autowired
	private LanguageService langService;
	
	public HomeController(LanguageService langService) {
		this.langService = langService;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Language>allLanguages=this.langService.allLanguages();
		for(Language l : allLanguages) {
			System.out.println(l.getId());
		}
		model.addAttribute("allLanguages", allLanguages);
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newItem(@ModelAttribute("lang") Language lang) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String createNew(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if(result.hasErrors()) {
			return "/new.jsp";
		} else {
			this.langService.createLanguage(lang);
			return "redirect:/";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("lang", this.langService.findLanguage(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if(result.hasErrors()) {
			return "/edit.jsp";
		} else {
			this.langService.updateLanguage(lang);
			return "redirect:/";
		}
	}
	
	@GetMapping("/show/{id}")
	public String showLang(@PathVariable("id") Long id, Model model) {
		model.addAttribute("lang", this.langService.findLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		return "redirect:/";
	}
}
