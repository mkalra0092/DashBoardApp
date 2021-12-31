package com.hygiene.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hygiene.dao.AQIRepository;
import com.hygiene.dao.BranchRepository;
import com.hygiene.dao.CustomerRepository;
import com.hygiene.pojos.AQIDate;
import com.hygiene.pojos.BranchMaster;
import com.hygiene.pojos.Customer;

@Controller
public class HomePageController {
	@Autowired
	private CustomerRepository crepo;
	@Autowired
	private BranchRepository brepo;

	@Autowired
	private AQIRepository aqirepo;

	@RequestMapping("/")
	public String showDetails() {
		return "/index";
	}

	@PostMapping("/")
	public String processDetails(@RequestParam String name, @RequestParam String city,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date dt, HttpSession hs,
			RedirectAttributes flashMap) {
		Customer c1 = crepo.findByCustName(name);
		System.out.println(c1);
		BranchMaster b1 = brepo.findByBranchName(city);
		System.out.println(b1);

		AQIDate aqi1 = aqirepo.findByDateTime(dt);
		System.out.println(aqi1);

		String status = "No User Found !!";

		if (c1.getBranchId().getBranchId() == b1.getBranchId()) {
			hs.setAttribute("aqi_dtls", aqi1);
			status = "User in the List !!";

		}

		flashMap.addFlashAttribute("status", status);
		return "redirect:/";
	}
}
