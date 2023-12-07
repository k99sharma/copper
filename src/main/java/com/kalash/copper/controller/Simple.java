package com.kalash.copper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {
	@GetMapping(path="/simple", produces="application/json")
	public String getSimple() {
		return "Hello, World!";
	}
}
