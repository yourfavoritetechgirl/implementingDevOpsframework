package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String greet(Model model, @RequestParam(name="name", required=false, defaultValue="World") String name) {
		
		//TODO: Do your business logic
		//TODO: Populate model
		
		model.addAttribute("name", name);
		
		return "hello";
	}
	

}
