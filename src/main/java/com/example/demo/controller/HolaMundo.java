package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HolaMundo {
	
	@GetMapping("")
	public String saludo() {
		
		return "index";
	}
	
	@GetMapping("que")
	public String que() {
		
		return "que";
	}
	
	@GetMapping("contacto")
	public String contacto() {
		
		return "contacto";
	}

}
