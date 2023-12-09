package com.kalash.copper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		return "signup";
	}
}
