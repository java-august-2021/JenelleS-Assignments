package com.JenelleHanson.routingpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//when you need to use jsp pages and not just a string
public class DojoController {
	@RequestMapping("/dojo")
	public String dojo() {
		System.out.println("The dojo is awesome!");
		return "index.jsp";
	}
	
	@RequestMapping("/dojo/{city}")
	public String city(@PathVariable("city") String city) {
		if(city.equals("burbank")) {
			System.out.println(city + " dojo is located in Southern California");
		} else if(city.equals("sanJose")) {
			System.out.println(city + " dojo is the headquarters");
		} else {
			System.out.println("*Shrug");
		}
		 return "index.jsp";
	}
	
//	@RequestMapping("/dojo/{sanJose}") and @RequestMapping("/dojo/{city}")
//  path variable will not work because they are the same route
}
