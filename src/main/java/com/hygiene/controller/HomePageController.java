package com.hygiene.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping("/")
	public String showDetails() {
		return "/index";
	}

}
