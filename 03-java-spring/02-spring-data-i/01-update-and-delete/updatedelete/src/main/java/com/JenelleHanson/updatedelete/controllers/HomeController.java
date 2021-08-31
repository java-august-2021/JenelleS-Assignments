package com.JenelleHanson.updatedelete.controllers;

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

import com.JenelleHanson.updatedelete.models.Book;
import com.JenelleHanson.updatedelete.services.BookService;

@Controller
//Rest Controller Will not display jsp pages (only used with Json objects with a view)
public class HomeController {
	@Autowired //creates dependency injection
	private final BookService bService;
	
	public HomeController(BookService bService) {
		this.bService = bService;
	}
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Book>allBooks=this.bService.allBooks();
		for(Book b : allBooks) {
			System.out.println(b.getId());
		}
		System.out.println(this.bService.allBooks());
		viewModel.addAttribute("allBooks", allBooks);
		return "index.jsp";
	}
	
	@GetMapping("/create")
	public String create(@ModelAttribute("book") Book book) {
		return "create.jsp";
	}
	
	@PostMapping("/create")
	public String newBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		this.bService.createBook(book);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@ModelAttribute("book") Book book, Model model, @PathVariable("id") Long id) {
		model.addAttribute("book", this.bService.findBook(id));
		return "Dashboard.jsp";
	}
	
	@PostMapping("/update/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, @PathVariable("id") Long id) {
		model.addAttribute("book", this.bService.findBook(id));
		this.bService.updateBook(book);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
		return "redirect:/";
	}
}
