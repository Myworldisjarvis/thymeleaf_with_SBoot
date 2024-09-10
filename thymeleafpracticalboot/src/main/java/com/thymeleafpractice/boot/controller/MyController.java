package com.thymeleafpractice.boot.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

@RequestMapping(value = "/about", method = RequestMethod.GET)
public String about(Model model) {
	
	model.addAttribute("name" , "Sadaf Hussain");
	model.addAttribute("cDate",new Date().toLocaleString());
	System.out.println("going to about hend...");
	return "about";
}
	

@GetMapping("/example-loop")
public String itrerateHandler(Model m) {
	
	List<String> list = List.of("Hi","by","chai","game");
//	List<String> list = null;
	
	m.addAttribute("list",list);
	
	return "itreate";
}

}
