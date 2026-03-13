package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Bienvenidos");
		return "index";
	}
}
