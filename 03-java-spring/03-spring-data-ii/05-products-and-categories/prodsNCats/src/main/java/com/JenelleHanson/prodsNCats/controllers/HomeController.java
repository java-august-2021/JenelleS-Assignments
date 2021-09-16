package com.JenelleHanson.prodsNCats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JenelleHanson.prodsNCats.models.Category;
import com.JenelleHanson.prodsNCats.models.Product;
import com.JenelleHanson.prodsNCats.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private final ProductService pSer;
	
	//constructor
	public HomeController(ProductService pSer) {
		this.pSer = pSer;
	}
	
	@GetMapping("/newProduct")
	public String displayProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/newProduct")
	public String sendToDatabase(@ModelAttribute("product") Product product) {
		Product newProduct = this.pSer.createProduct(product);
		Long prodId = newProduct.getId();
		return "redirect:/products/" + prodId ;
	}
	
	@GetMapping("/products/{id}")
	public String oneProd(@PathVariable("id") Long id, Model model) {
		Product oneProduct = this.pSer.findProduct(id);
		model.addAttribute("product", oneProduct);
		model.addAttribute("allCats", this.pSer.findCatsByProduct(oneProduct));
		model.addAttribute("allNotCats", this.pSer.findCatsNotIncludedByProduct(oneProduct));
		return "showProd.jsp";
	}
	
	//connect everything together
	@PostMapping("/products/{id}")
	public String addProd(@RequestParam("categories") Long categoryId, @PathVariable("id") Long id, Model model) {
		Category catId = pSer.findCategory(categoryId);
		pSer.createRelationship(id, categoryId);
		return "redirect:/products/{id}";
	}
	
	@GetMapping("/newCategory")
	public String displayCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/newCategory")
	public String whatCategory(@ModelAttribute("category") Category category, Model model) {
		Category newCat = this.pSer.createCategory(category);
		Long catId = newCat.getId();
		return "redirect:/categories/" + catId;//should redirect to the next page
	}
	
	@GetMapping("/categories/{id}")
	public String oneCat(@PathVariable("id") Long id, Model model) {
		Category oneCategory = this.pSer.findCategory(id);
		model.addAttribute("category", oneCategory);
		model.addAttribute("allNotProds", this.pSer.findProdsNotIncludedByCats(oneCategory));
		return "showCats.jsp";
	}
	
	//connect everything together
	@PostMapping("/categories/{id}")
	public String addCat(@RequestParam("product") Long productId, @PathVariable("id") Long id, Model model) {
		pSer.createRelate(id, productId);
		return "redirect:/categories/{id}";
	}
	
}
