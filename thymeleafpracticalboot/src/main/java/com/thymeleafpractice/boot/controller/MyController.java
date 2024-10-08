package com.thymeleafpractice.boot.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

//	handler for basic statements
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {

		model.addAttribute("name", "Sadaf Hussain");
		model.addAttribute("cDate", new Date().toLocaleString());
		System.out.println("going to about hend...");
		return "about";
	}

//handler for ( each loop ) statements
	@GetMapping("/example-loop")
	public String itrerateHandler(Model m) {

		List<String> list = List.of("Hi", "by", "chai", "game");
//	List<String> list = null;
		m.addAttribute("list", list);

		return "itreate";
	}

// handler for conditional statements 
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "M");

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
		m.addAttribute("numList", list);

		return "condition";
	}

// handler for including fragments or dynamic vlaue
	@GetMapping("/service")
	public String servicesHandler(Model m) {

		m.addAttribute("title", "I Am Programmer");
		m.addAttribute("subtitle", LocalDate.now().toString());

		return "services";
	}
// handler for fregment inheriting
	@GetMapping("/aboutnew")
	public String newAboutHandler(Model m) {

		
		return "aboutnew";
	}
}
