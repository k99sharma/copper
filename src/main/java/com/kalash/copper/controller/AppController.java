package com.kalash.copper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	// index controller
	@GetMapping(path="/")
	public String getApp() {
		return "index";
	}
	
	// not found controller
	@GetMapping(path="*")
	public String getNotFound() {
		return "notFound";
	}
}
