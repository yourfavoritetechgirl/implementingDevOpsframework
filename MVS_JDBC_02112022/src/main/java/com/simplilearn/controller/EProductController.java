package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.pojo.EProduct;
import com.simplilearn.service.EProductService;

@Controller
public class EProductController {
	
	@Autowired
	EProductService eProductService;
	
	@GetMapping("/getProducts")
	public String getProducts(Model model) {
		List<EProduct> products = eProductService.getProducts();
		model.addAttribute("prodList", products);
		
		return "product-list";
	}

}
