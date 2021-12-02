package com.JenelleHanson.lookify2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JenelleHanson.lookify2.models.Lookify2;
import com.JenelleHanson.lookify2.services.Lookify2Service;

@Controller
public class HomeController {
	@Autowired
	private final Lookify2Service lService;
	
	public HomeController(Lookify2Service lService) {
		this.lService = lService;
	}

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String index(Model model) {
		model.addAttribute("allSongs", lService.allSongs());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String createSong(@ModelAttribute("song") Lookify2 song) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String newSong(@Valid @ModelAttribute("song") Lookify2 song, BindingResult result) {
		if(result.hasErrors()) {
			return "/new.jsp";
		} else {
			this.lService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/songs/{id}")
	public String viewSong(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", this.lService.findSong(id));
		return "viewSong.jsp";
	}
	
	@GetMapping("/topTen")
	public String topTen(Model model) {
		model.addAttribute("allSongs", lService.findTopTen());
		return "topTen.jsp";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("artist") String artist, Model model) {//If you need to search anything it is a request parameter
		model.addAttribute("allSongsByArtist", this.lService.searchArtist(artist));
		model.addAttribute("artist", artist);// you need both the songs and the artist
		return "search.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String eraseSong(@PathVariable("id") Long id) {
		this.lService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	
	
}
