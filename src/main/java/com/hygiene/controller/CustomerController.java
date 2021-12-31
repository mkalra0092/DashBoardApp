package com.hygiene.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hygiene.pojos.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@GetMapping("/add")
	public String showCustomerForm(Customer customer) {
		return "/customer/add";
	}

	@PostMapping("/add")
	public String processCustomerForm(Customer customer, RedirectAttributes modelMap) {
		
		
		return "redirect:/customer/add";
	}

}
